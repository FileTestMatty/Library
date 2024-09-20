package authorDao;

import it.alfasoft.DaoException;
import it.alfasoft.IDao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.sql.*;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@ApplicationScoped
@Named("Ge")
public class GestioneAutori implements IDao<Autore, Integer>  {

	protected Connection c;
	protected Statement stmt;
	private String dburl;
	private String dbuser;
	private String dbpwd;
	protected List<Autore> list;

	// Costruttore
	public GestioneAutori() {
		this.list = new ArrayList<>();

		try {
			InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
			Properties prop = new Properties();
			prop.load(input);
			this.dburl = prop.getProperty("db.url");
			this.dbuser = prop.getProperty("db.user");
			this.dbpwd = prop.getProperty("db.password");

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public GestioneAutori(String dburl, String dbuser, String dbpwd) {
		this.list = new ArrayList<>();

		try {
			InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
			Properties prop = new Properties();
			prop.load(input);
			this.dburl = dburl;
			this.dbuser = dbuser;
			this.dbpwd = dbpwd;

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	@Override
	public Integer create(Autore autore) throws DaoException {

		int id = 0;

		try {

			Statement stmt = null;

			stmt = getStatement();

			String sql = generateInsertSQL(autore);

			int row = stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

			ResultSet rs = stmt.getGeneratedKeys();


			if ( rs.next() ) {

				id = rs.getInt(1);
				autore.setIdAutore(id);
			}
		} catch ( SQLException e ) {

			e.printStackTrace();
			throw new DaoException("errore Create");
		}

		return id;
	}

	private String generateInsertSQL(Autore autore) {

		return "INSERT INTO authors(name_author, surname_author) VALUES ('"
				+ autore.getNomeAutore() + "', '"
				+ autore.getCognomeAutore() + "');";
	}

	@Override
	public List<Autore> read(int page, int size) throws DaoException {

		Statement stmt = null;
		cleanList();

		try {

			stmt = getStatement();
			String sql = generateReadSQL(page, size);
			//System.out.println("eccomi: " + sql);
			ResultSet rs = stmt.executeQuery(sql);

			while ( rs.next() ) {

				this.list.add(resultSetToObject(rs));
			}

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DaoException("errore read");
		}


		return list;
	}

	protected Autore resultSetToObject(ResultSet rs) throws SQLException {

		int id = rs.getInt(1);
		String nomeAutore = rs.getString(2);
		String cognomeAutore = rs.getString(3);

		return new Autore ( id, nomeAutore, cognomeAutore );
	}

	private String generateReadSQL(int page, int size) {

		return "Select * from authors limit " + page + " offset " + size;
	}

	@Override
	public Integer delete(Integer id) throws DaoException {

		int idDelete = 0;

		try {

			Statement stmt = null;

			stmt = getStatement();

			String sql = generateDeleteSQL(id);

			int row = stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

			ResultSet rs = stmt.getGeneratedKeys();


			if ( rs.next() ) {

				idDelete = rs.getInt(1);
			}
		} catch ( SQLException e ) {

			e.printStackTrace();
			throw new DaoException("errore Create");
		}

		return idDelete;
	}

	private String generateDeleteSQL(int id) {

		return "delete from authors where id_author =" + id;
	}

	@Override
	public Integer update(Autore autore) throws DaoException {

		int idUpdate = 0;

		try {

			Statement stmt = null;

			stmt = getStatement();

			String sql = generateUpdateSQL(autore);

			int row = stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

			ResultSet rs = stmt.getGeneratedKeys();


			if ( rs.next() ) {

				idUpdate = rs.getInt(1);
			}

		} catch ( SQLException e ) {

			e.printStackTrace();
			throw new DaoException("errore Update");
		}

		return idUpdate;
	}

	private String generateUpdateSQL(Autore autore) {

		return "UPDATE authors Set name_author = '" + autore.getNomeAutore() + "', surname_author = '" + autore.getCognomeAutore() + "' WHERE id_author =" + autore.getIdAutore();
	}

	@Override
	public Autore getById(Integer id) throws DaoException {

		Autore autore = null;

		try {

			Statement stmt = null;

			stmt = getStatement();

			String sql = generateGetByIdSQL(id);

			ResultSet rs = stmt.executeQuery(sql);

			if ( rs.next() ) {

				autore = new Autore( rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch ( SQLException e ) {

			e.printStackTrace();
			throw new DaoException("errore FindByID");
		}

		return autore;
	}

	private String generateGetByIdSQL(Integer id) {

		return "Select * from authors where id_author =" + id;
	}

	@Override
	public List<Autore> find(String searchText) throws DaoException {
		// Implementazione del metodo per trovare autori tramite testo di ricerca
		return Collections.emptyList();
	}

	@Override
	public List<Autore> find(Autore searchText) throws DaoException {

		Statement stmt = null;
		cleanList();

		try {

			stmt = getStatement();
			String sql = generateFindObjectSQL(searchText.getNomeAutore(), searchText.getCognomeAutore());
			//System.out.println("eccomi: " + sql);
			ResultSet rs = stmt.executeQuery(sql);

			while ( rs.next() ) {

				this.list.add(resultSetToObject(rs));
			}

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DaoException("errore");
		}


		return list;
	}

	private String generateFindObjectSQL(String nomeAutore, String cognomeAutore) {

		return "Select * from authors where name_author='" + nomeAutore + "' AND surname_author = '" + cognomeAutore + "'";
	}

	protected Connection getConnection() throws SQLException {
		Connection c = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(this.dburl, this.dbuser, this.dbpwd);
		} catch (ClassNotFoundException e) {
			throw new SQLException("Errore nel caricamento del Driver!");
		}
		return c;
	}

	protected Statement getStatement() throws SQLException {
		return getConnection().createStatement();
	}

	protected List<Autore> getList() {

		return this.list;
	}

	protected void cleanList() {

		this.list.removeAll(list);
	}
}