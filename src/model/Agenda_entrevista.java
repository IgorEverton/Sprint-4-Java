package model;

public class Agenda_entrevista {
	private String local;
	private String dt_entre;
	private String hr_entre;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getDt_entre() {
		return dt_entre;
	}
	public void setDt_entre(String dt_entre) {
		this.dt_entre = dt_entre;
	}
	public String getHr_entre() {
		return hr_entre;
	}
	public void setHr_entre(String hr_entre) {
		this.hr_entre = hr_entre;
	}
	
	Agenda_entrevista(){
		
	}
	
	public Agenda_entrevista(String local, String dt_entre, String hr_entre){
		this.local = local;
		this.dt_entre = dt_entre;
		this.hr_entre = hr_entre;
	}
}

