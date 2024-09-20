package it.alfasoft;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.util.Collections;
import java.util.List;

public class BookDAoJPA implements IDao<Book, Integer> {

    EntityManagerFactory emf;
    EntityManager em;

    public BookDAoJPA() {

        try {
            this.emf = Persistence.createEntityManagerFactory("Author");
            this.em = emf.createEntityManager();
        } catch (Exception e) {

            e.printStackTrace();
            throw new RuntimeException("errore costruttore");
        }

    }

    @Override
    public Integer create(Book book) throws DaoException {

        Integer id = 0;

        try {

            em.getTransaction().begin();

           /* for ( int i = 1; i < book.getAuthorsSet().size(); i++ ) {

                em.merge(i);
            }*/
            em.persist(book);
            id = book.getId().intValue();
            em.getTransaction().commit();

        } catch ( PersistenceException e ) {

            e.printStackTrace();
            throw new DaoException("errore create");
        }

        return id;
    }

    @Override
    public List<Book> read(int i, int i1) throws DaoException {
        return Collections.emptyList();
    }

    @Override
    public Integer delete(Integer integer) throws DaoException {
        return 0;
    }

    @Override
    public Integer update(Book book) throws DaoException {
        return 0;
    }

    @Override
    public Book getById(Integer integer) throws DaoException {
        return null;
    }

    @Override
    public List<Book> find(String s) throws DaoException {
        return Collections.emptyList();
    }

    @Override
    public List<Book> find(Book book) throws DaoException {
        return Collections.emptyList();
    }
}
