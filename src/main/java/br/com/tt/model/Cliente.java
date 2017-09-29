package br.com.tt.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.tt.service.ClienteDAO;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String nome;
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void salvar() {
		new ClienteDAO().salvar(this);

	}
	
	public void deletar() {
		new ClienteDAO().deletar(this);
	}
	
	public Cliente buscar(Long id) {
		return new ClienteDAO().buscar(id);
	}

}
