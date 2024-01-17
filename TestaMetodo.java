package contas;

public class TestaMetodo {
	public static void main(String[] args) {
		conta contaDoMatheus = new conta();
		
		contaDoMatheus.deposita(100);
		contaDoMatheus.deposita(70);
		System.out.println(contaDoMatheus.getSaldo());
		
		contaDoMatheus.saca(30);
		System.out.println(contaDoMatheus.getSaldo());
		
		contaDoMatheus.saca(200);
		System.out.println("O saldo do Matheus antes da tranferencia é " +contaDoMatheus.getSaldo());
		
		conta contaDaMaria = new conta();
		contaDaMaria.deposita(1000);
		
		System.out.println("O saldo da Maria antes da transferencia é "+ contaDaMaria.getSaldo());
		
		contaDaMaria.transfere(1300,contaDoMatheus);
		System.out.println("O saldo da Maria depois da transferencia é "+contaDaMaria.getSaldo());
		System.out.println("O saldo do Matheus depois da transferencia é "+contaDoMatheus.getSaldo());
		
	}
}
