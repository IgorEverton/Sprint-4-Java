package model;

public class Endereco {
	private String nome_rua;
	private int num_rua;
	private String cep;
	private String comple;
	private String estado;
	private String cidade;
	
	public String getNome_rua() {
		return nome_rua;
	}
	public void setNome_rua(String nome_rua) {
		this.nome_rua = nome_rua;
	}
	public int getNum_rua() {
		return num_rua;
	}
	public void setNum_rua(int num_rua) {
		this.num_rua = num_rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComple() {
		return comple;
	}
	public void setComple(String comple) {
		this.comple = comple;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	Endereco(){
		
	}
	
	public Endereco(String nome_rua, int num_rua, String cep, String comple, String estado, String cidade){
		this.nome_rua = nome_rua;
		this.num_rua = num_rua;
		this.cep = cep;
		this.comple = comple;
		this.estado = estado;
		this.cidade = cidade;
	}
	
}
