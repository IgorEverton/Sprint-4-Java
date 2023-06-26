package model;

public class Descri_vaga {
	private double salario;
	private String requisitos;
	private String carga_hr;
	private String dt_inicio;
	private String dt_fim;
	private int qtd_vaga;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public String getCarga_hr() {
		return carga_hr;
	}
	public void setCarga_hr(String carga_hr) {
		this.carga_hr = carga_hr;
	}
	public String getDt_inicio() {
		return dt_inicio;
	}
	public void setDt_inicio(String dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	public String getDt_fim() {
		return dt_fim;
	}
	public void setDt_fim(String dt_fim) {
		this.dt_fim = dt_fim;
	}
	public int getQtd_vaga() {
		return qtd_vaga;
	}
	public void setQtd_vaga(int qtd_vaga) {
		this.qtd_vaga = qtd_vaga;
	}
	
	Descri_vaga(){
		
	}
	
	public Descri_vaga(double salario, String requisitos, String carga_hr, String dt_inicio, String dt_fim, int qtd_vaga){
		this.salario = salario;
		this.requisitos = requisitos;
		this.carga_hr = carga_hr;
		this.dt_inicio = dt_inicio;
		this.dt_fim = dt_fim;
		this.qtd_vaga = qtd_vaga;
	}
	
}
