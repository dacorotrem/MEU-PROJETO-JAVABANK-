package contas;

public class testeReferencia {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.deposita(300);
		
		System.out.println("O saldo da primeira conta é " + primeiraConta.getSaldo());
		
		conta segundaConta = new conta();
		
		System.out.println("O saldo da segunda conta é " + segundaConta.getSaldo());
		
		segundaConta.deposita(100);
		System.out.println("O saldo da segunda conta é : "+ segundaConta.getSaldo());
		
		System.out.println("O saldo da primeira conta é : "+ primeiraConta.getSaldo());
		
		if(primeiraConta == segundaConta){
			System.out.println("Sao a mesma conta!");
		}
		else {
			System.out.println("Nao sao a mesma conta!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
