package model;

public class Vaga {
	private int id_vaga;
	private String nm_area;
	private String st_vaga;
	
	public int getId_vaga() {
		return id_vaga;
	}
	public void setId_vaga(int id_vaga) {
		this.id_vaga = id_vaga;
	}
	public String getNm_area() {
		return nm_area;
	}
	public void setNm_area(String nm_area) {
		this.nm_area = nm_area;
	}
	public String getSt_vaga() {
		return st_vaga;
	}
	public void setSt_vaga(String st_vaga) {
		this.st_vaga = st_vaga;
	}
	
	Vaga(){
			
	}
	
	public Vaga(int id_vaga, String nm_area, String st_vaga){
		this.id_vaga = id_vaga;
		this.nm_area = nm_area;
		this.st_vaga = st_vaga;
	}
}
