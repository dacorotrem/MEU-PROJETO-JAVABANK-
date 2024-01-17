package contas;

public class CriaConta {

	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.deposita(200);
		System.out.println("O saldo da primeira conta é " + primeiraConta.getSaldo() + "Reais");
		
		primeiraConta.deposita(100);;
		System.out.println(primeiraConta.getSaldo());
		
		conta segundaConta = new conta();
		segundaConta.deposita(50);
		
		System.out.println("Primeira conta = " + primeiraConta.getSaldo() );
		System.out.println("Segunda conta = " + segundaConta.getSaldo());
		
		System.out.println(segundaConta.getNumero());
	}
}
