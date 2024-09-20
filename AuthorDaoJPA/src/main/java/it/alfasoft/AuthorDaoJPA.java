package it.alfasoft;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class AuthorDaoJPA implements IDao<Author, Integer> {

    EntityManagerFactory emf;
    EntityManager em;

    public AuthorDaoJPA() {

        try {
            this.emf = Persistence.createEntityManagerFactory("Author");
            this.em = emf.createEntityManager();
        } catch (Exception e) {

            e.printStackTrace();
            throw new RuntimeException("errore costruttore");
        }

    }

    @Override
    public Integer create(Author author) throws DaoException {

        Integer id = 0;

        try {

            em.getTransaction().begin();
            em.persist(author);
            id = author.getId().intValue();
            em.getTransaction().commit();

        } catch ( Exception e ) {

            throw new DaoException("errore create");
        }

        return id;
    }

   @Override
    public List<Author> read(int i, int i1) throws DaoException {

        em.getTransaction().begin();

        List<Author> authors = em.createNativeQuery("SELECT * FROM authors ").getResultList();

        em.getTransaction().commit();

        return authors;
    }

    @Override
    public Integer delete(Integer integer) throws DaoException {

        try {

            em.getTransaction().begin();
            Long l = new Long(integer);
            Author author = findById(l);
            em.remove(author);
            em.getTransaction().commit();

            return 1;

        } catch ( Exception e ) {

            e.printStackTrace();
            throw new DaoException("errore delete");
        }
    }

    /*@Override
    public Integer delete(Integer integer) throws DaoException {

        Integer result = 0;

        em.getTransaction().begin();

        if (result == 0 ) {

            Long l = new Long(integer);
            Author author = findById(l);
            em.remove(author);
            result = 1;
        }
        em.getTransaction().commit();

        return result;
    }*/

    @Override
    public Integer update(Author author) throws DaoException {
        return 0;
    }

    @Override
    public Author getById(Integer integer) throws DaoException {
        return null;
    }

    public Author findById(Long id) {

        return em.find(Author.class, id);
    }

    @Override
    public List<Author> find(String s) throws DaoException {
        return Collections.emptyList();
    }

    @Override
    public List<Author> find(Author author) throws DaoException {
        return Collections.emptyList();
    }
}
