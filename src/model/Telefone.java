package model;

public class Telefone {
	private int ddi;
	private int ddd;
	private int numero;
	
	public int getDdi() {
		return ddi;
	}
	public void setDdi(int ddi) {
		this.ddi = ddi;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	Telefone(){
		
	}
	
	public Telefone(int ddi, int ddd, int numero){
		this.ddi = ddi;
		this.ddd = ddd;
		this.numero = numero;
	}
	
}
