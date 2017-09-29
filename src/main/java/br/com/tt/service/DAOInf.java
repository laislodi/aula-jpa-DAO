package br.com.tt.service;

import java.util.List;

public interface DAOInf<T> {

	void salvar(T t);

	void salvar(List<T> list);

	void deletar(T t);

	void deletar(Long id);

	void deletar(List<T> list);

	T buscar(Long id);

	T buscar(T t);

	List<T> consultar(T t);
	
	
}
