package br.com.tt;

import br.com.tt.model.Cliente;
import br.com.tt.service.ClienteDAO;

public class Sistema {
	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lais Lodi");
		cliente1.setCpf("11111111111");
		cliente1.salvar();
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Aline Lopes");
		cliente2.setCpf("44444444444");
		cliente2.salvar();
		
		Cliente c = new ClienteDAO().buscar(1L);
		c.deletar();
		
		System.exit(0);
	}

}
