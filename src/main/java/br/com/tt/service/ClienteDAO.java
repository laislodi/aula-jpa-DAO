package br.com.tt.service;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.tt.model.Cliente;
import br.com.tt.util.Util;

public class ClienteDAO implements DAOInf<Cliente> {

	public void salvar(Cliente cliente) {
		EntityManager em = Util.iniciarConexao();
		em.merge(cliente);
		Util.fecharConexao();
	}

	public void salvar(List<Cliente> list) {
		EntityManager em = Util.iniciarConexao();
		for (Cliente c : list) {
			em.merge(c);
		}
		Util.fecharConexao();
	}

	public void deletar(Cliente cliente) {
		EntityManager em = Util.iniciarConexao();
		em.remove(cliente);
		Util.fecharConexao();
	}

	public void deletar(Long id) {
		deletar(buscar(id));

	}

	public void deletar(List<Cliente> list) {
		EntityManager em = Util.iniciarConexao();
		list.forEach(em::remove);
		Util.fecharConexao();

	}

	public Cliente buscar(Long id) {
		return Util.em().find(Cliente.class, id);
	}

	public Cliente buscar(Cliente cliente) {
		
		
		return null;
	}

	public List<Cliente> consultar(Cliente cliente) {
		
		
		
		 return null;
	}

}
