package model;

public class Rh {
	private int id_funcio;
	private String nome_funcio;
	private String dt_nasc;
	
	public int getId_funcio() {
		return id_funcio;
	}
	public void setId_funcio(int id_funcio) {
		this.id_funcio = id_funcio;
	}
	public String getNome_funcio() {
		return nome_funcio;
	}
	public void setNome_funcio(String nome_funcio) {
		this.nome_funcio = nome_funcio;
	}
	public String getDt_nasc() {
		return dt_nasc;
	}
	public void setDt_nasc(String dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
	
	Rh(){
		
	}
	
	public Rh(int id_funcio, String nome_funcio, String dt_nasc){
		this.id_funcio = id_funcio;
		this.nome_funcio = nome_funcio;
		this.dt_nasc = dt_nasc;
	}
}
