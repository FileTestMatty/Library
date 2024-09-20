package service;

import authorDao.Autore;
import it.alfasoft.DaoException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.sql.SQLException;

@WebService(targetNamespace = "http://alfasoft.it/authors")
public interface IAuthorService {

    @WebMethod(operationName = "createAuthors")
    @WebResult(name = "autore")
    Integer createAuthors( @WebParam(name = "autore") Autore autore ) throws DaoException;

    @WebMethod(operationName = "getAuthors")
    @WebResult(name = "autori")
    List<Autore> getAuthors(Paginator paginator) throws DaoException;

     @WebMethod(operationName = "deleteAuthors")
     @WebResult(name = "autoreDelete")
    Integer deleteAuthor( @WebParam(name = "id") Integer id ) throws DaoException;

     @WebMethod(operationName = "getById")
      @WebResult(name = "authorByID")
     Autore getById(@WebParam(name = "id") Integer id) throws DaoException;

      @WebMethod(operationName = "find")
      @WebResult(name = "authorsByObject")
     List<Autore> find(@WebParam(name = "authorsByObject") Autore searchText) throws DaoException;

      Integer update (@WebParam(name = "autore") Autore autore ) throws DaoException;
}

