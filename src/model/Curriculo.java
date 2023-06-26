package model;

public class Curriculo {
	private String escolaridade;
	private String nome_facul;
	private String descricao_curso;
	private String status_gradu;
	
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getNome_facul() {
		return nome_facul;
	}
	public void setNome_facul(String nome_facul) {
		this.nome_facul = nome_facul;
	}
	public String getDescricao_curso() {
		return descricao_curso;
	}
	public void setDescricao_curso(String descricao_curso) {
		this.descricao_curso = descricao_curso;
	}
	public String getStatus_gradu() {
		return status_gradu;
	}
	public void setStatus_gradu(String status_gradu) {
		this.status_gradu = status_gradu;
	}
	
	Curriculo(){
		
	}
	
	public Curriculo(String escolaridade, String nome_facul, String descricao_curso, String status_gradu){
		this.escolaridade = escolaridade;
		this.nome_facul = nome_facul;
		this.descricao_curso = descricao_curso;
		this.status_gradu = status_gradu;
	}
	
}
