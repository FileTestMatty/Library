package it.alfasoft;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AppTest {

    private AuthorDaoJPA dao;
    private BookDAoJPA daoBook;

    @BeforeEach
    public void setup() {

        dao = new AuthorDaoJPA();
        daoBook = new BookDAoJPA();

    }

    @Test
    public void createTest() throws DaoException {

        Book book = new Book("libromatteo", "1234");
        Book[] books = {book};

        Author autore2 = new Author("ebasta", "aronica");

        Integer generatedId = dao.create(autore2);


        Assertions.assertTrue(generatedId == 5, "errore create");

    }

    @Test
    public void createBookTest() throws DaoException {
        //Author autore2 = new Author("among", "NUOVO2");
        //Author[] authors = {autore2};
       Long l = new Long(6);
        Author autore = dao.findById(l);
        Author[] authors = {autore};

        Book book = new Book("provaFinale12", "5678", authors);

        Integer generatedId = daoBook.create(book);


        Assertions.assertTrue(generatedId == 37, "errore create");

    }

    @Test
    public void getByIDTest() throws DaoException {

        Long l = new Long(6);
        Author autoreActual = dao.findById(l);

        Assertions.assertTrue(autoreActual.getId() == 6, "error getByID");
    }

    @Test
    public void removeTest() throws  DaoException {

        System.out.println("sono su remove");
        Integer id = dao.delete(2);

        Assertions.assertTrue( id == 1, "errore remove" );

    }


    @Test
    public void readTest() throws DaoException {

        System.out.println("sono su get");
        List<Author> authors = dao.read(20, 0);

        Assertions.assertTrue(authors.size() == 3, "La lista di autori non dovrebbe essere maggiore di 10");
    }

    public void findByIdTest() throws DaoException {


    }



}


//TEST FUNZIONANTE SENZA MANY TO MANY
/*


private AuthorDaoJPA dao;

    @BeforeEach
    public void setup() {

        dao = new AuthorDaoJPA();

    }

    @Test
    public void createTest() throws DaoException {

       // Long l = new Long(6);

        Author autore = new Author("zarzi", "pirandello"  );

        Integer generatedId = dao.create(autore);


        Assertions.assertTrue(generatedId == 6, "errore create");

    }

    @Test
    public void removeTest() throws  DaoException {

        System.out.println("sono su remove");
        Integer id = dao.delete(5);

        Assertions.assertTrue( id == 1, "errore remove" );

    }


    @Test
    public void getTest() throws DaoException {

        System.out.println("sono su get");
        List<Author> authors = dao.read(10, 0);

        Assertions.assertTrue(authors.size() == 5, "La lista di autori non dovrebbe essere maggiore di 10");
    }
 */