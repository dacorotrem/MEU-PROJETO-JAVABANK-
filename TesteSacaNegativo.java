package contas;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		conta conta = new conta();
		conta.deposita(100);
		conta.saca(50);
		System.out.println(conta.getSaldo());
	
}
}
