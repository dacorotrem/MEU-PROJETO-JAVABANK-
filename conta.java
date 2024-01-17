package contas;

import cliente.Cliente;

//saldo,agencia,numero,titular
public class conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	public boolean saca(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Não há saldo suficiente. SALDO NEGADO!");
			return false;
		}
	}
	public boolean transfere(double valor,conta destino) {
		if(this.saldo>= valor){
			System.out.println("A sua transaçao foi concluida!");
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else{
			System.out.println("A sua transaçao não foi concluida!");
			return false;
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	public double getNumero(){
		return this.numero;
	}
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
			
		}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	}