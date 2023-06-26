package model;

public class Candidato {
	private int id_candidato;
	private String nm_candidato;
	private String cpf;
	private int rg;
	private String dtNasc;
	private String sexo;
	
	
	public int getId_candidato() {
		return id_candidato;
	}
	public void setId_candidato(int id_candidato) {
		this.id_candidato = id_candidato;
	}
	public String getNm_candidato() {
		return nm_candidato;
	}
	public void setNm_candidato(String nm_candidato) {
		this.nm_candidato = nm_candidato;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Candidato(){
		
	}
	
	public Candidato(int id_candidato, String nm_candidato, String cpf, int rg, String dtNasc, String sexo){
		this.id_candidato = id_candidato;
		this.nm_candidato = nm_candidato;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNasc = dtNasc;
		this.sexo = sexo;
	}
}
