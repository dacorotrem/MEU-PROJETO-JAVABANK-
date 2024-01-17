package contas;

import cliente.Cliente;

public class TestGettersESetters {
	public static void main(String[] args) {
	conta conta = new conta();
	conta.setNumero(13);
	System.out.println(conta.getNumero());
	
	Cliente cliente = new Cliente();
	conta.setTitular(cliente);
	cliente.setCPF("171.411.784.73");
	
	System.out.println(conta.getTitular().getCPF());
	}
}
