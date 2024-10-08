package it.alfasoft;

import java.util.List;

public interface IDao<T,I>{

    I create(T elemento) throws DaoException;

    List<T> read(int page,int pageSize) throws DaoException;

    I delete(I id) throws DaoException;

	I update(T elemento) throws DaoException;

	T getById(I indice) throws DaoException;

	List<T> find(String searchText) throws DaoException;

	List<T> find(T searchText) throws DaoException;

}