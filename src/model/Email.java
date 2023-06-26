package model;

public class Email {
	private String email;
	private String status_email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus_email() {
		return status_email;
	}
	public void setStatus_email(String status_email) {
		this.status_email = status_email;
	}
	
	public Email(){
		
	}
	
	public Email(String email, String status_email){
		this.email = email;
		this.status_email = status_email;
	}
}
