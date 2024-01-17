package cliente;

import contas.conta;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente Matheus = new Cliente();
		Matheus.getNome();
		Matheus.getCPF();
		Matheus.getProfissao();
		
		conta contaDoMatheus = new conta();
		contaDoMatheus.deposita (200);
		
		
		System.out.println(contaDoMatheus.getTitular());
	}
}
