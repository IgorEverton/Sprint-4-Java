package model;

public class Empresa {
	private int id_empresa;
	private String nm_empresa;
	
	public int getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getNm_empresa() {
		return nm_empresa;
	}
	public void setNm_empresa(String nm_empresa) {
		this.nm_empresa = nm_empresa;
	}
	
	Empresa(){
		
	}
	
	public Empresa(int id_empresa, String nm_empresa){
		this.id_empresa = id_empresa;
		this.nm_empresa = nm_empresa;
	}
	
}
