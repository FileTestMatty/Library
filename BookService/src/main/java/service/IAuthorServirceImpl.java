package service;

import authorDao.Autore;
import authorDao.GestioneAutori;
import it.alfasoft.DaoException;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;
import javax.interceptor.Interceptor;
import javax.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "service.IAuthorService")
@ApplicationScoped
@Named("IA")
public class IAuthorServirceImpl implements  IAuthorService {

    @Inject @Named("Ge")
    private GestioneAutori gestioneAutori;


    public IAuthorServirceImpl() {

    }

    @Override
    public Integer createAuthors(Autore autore) throws DaoException {

        return gestioneAutori.create(autore);
    }

    @Override
    public List<Autore> getAuthors(Paginator paginator) throws DaoException {

        return gestioneAutori.read(paginator.getPage(), paginator.getSize());
    }

    @Override
    public Integer deleteAuthor(Integer id) throws DaoException {

        return gestioneAutori.delete(id);
    }

    @Override
    public Autore getById(Integer id) throws DaoException {

        return gestioneAutori.getById(id);
    }

    @Override
    public List<Autore> find(Autore searchText) throws DaoException {

        return gestioneAutori.find(searchText);
    }

    @Override
    public Integer update(Autore autore) throws DaoException {

        return gestioneAutori.update(autore);
    }

}
