package model;

public class Bot {
	private int id_bot;
	private String nome_bot;
	
	public int getId_bot() {
		return id_bot;
	}
	public void setId_bot(int id_bot) {
		this.id_bot = id_bot;
	}
	public String getNome_bot() {
		return nome_bot;
	}
	public void setNome_bot(String nome_bot) {
		this.nome_bot = nome_bot;
	}
	
	Bot(){
		
	}
	
	public Bot(int id_bot, String nome_bot){
		this.id_bot = id_bot;
		this.nome_bot = nome_bot;
	}
}
