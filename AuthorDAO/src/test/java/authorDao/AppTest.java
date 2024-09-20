package authorDao;

import it.alfasoft.DaoException;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;


public class AppTest {

    private String nameSchema = "test";
    private static int numberSchema = 1;
    private Connection c;
    private Statement stmt;
    private static String dburl;
    private static String dbuser;
    private static String dbpwd;
    private GestioneAutori ga;

    @BeforeAll
    public static void config() {

        try (InputStream input = AppTest.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();
            prop.load(input);
            dburl = prop.getProperty("db.url");
            dbuser = prop.getProperty("db.user");
            dbpwd = prop.getProperty("db.password");
            //this.dburl = dburl + nameSchema;
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch ( IOException e ) {

            e.printStackTrace();

        }  catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeEach
    public void setDb() {

        try {

            c = DriverManager.getConnection(dburl, dbuser, dbpwd);
            stmt = c.createStatement();
            stmt.executeUpdate("CREATE database " + nameSchema + numberSchema );
            stmt.close();
            c.close();

            System.out.println("prima" + dburl);
            dburl =  "jdbc:mysql://localhost:3306/" + nameSchema + numberSchema;
            numberSchema++;
            ga = new GestioneAutori(dburl, dbuser, dbpwd);

            System.out.println(dburl);
            c = DriverManager.getConnection(dburl, dbuser, dbpwd);
            stmt = c.createStatement();

            //stmt.executeUpdate("USE " + nameSchema + numberSchema );

            //creo tabella
            stmt.executeUpdate("Create table authors ( " +
                    " id_author int not null primary key auto_increment, " +
                    " name_author varchar(45), " +
                    " surname_author varchar(45));");


            stmt.executeUpdate("INSERT INTO authors  (name_author, surname_author ) VALUES " +
                    "(  'matteo', 'aronica')," +
                    "( 'riccardo', 'faraone')," +
                    "('andrea', 'mineo')");




        } catch (SQLException s) {

            s.printStackTrace();
        }

    }

   @Test
    public void createTest () throws DaoException {


        Autore autore = new Autore( 4, "luigi", "pirandello");

        Assertions.assertEquals( autore.getIdAutore(),
               ga.create(autore),
                "errore crezione autore"
        );

    }

    @Test
    public void getTest() throws DaoException {

        Iterable<Autore> expectedList = Arrays.asList(
                new Autore(1,"matteo", "aronica"),
                new Autore(2,"riccardo", "faraone"),
                new Autore(3, "andrea", "mineo")
        );

        Iterable<Autore> actualList = ga.read(10,0);

        Assertions.assertIterableEquals(expectedList, actualList, "Le liste degli autori dovrebbero essere uguali.");
    }

}

