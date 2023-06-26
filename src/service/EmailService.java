package service;

import dao.Dao;
import model.Candidato;
import model.Email;

public class EmailService {
	public static void InserirEmail(Candidato c, Email e) {
		String query = String.format("insert into t_rhh_email(id_candidato,ds_email,st_email)values(%s,'%s','%s')",c.getId_candidato(), e.getEmail(), e.getStatus_email());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void AtualizarEmail(Candidato c, Email e) {
		String query = String.format("update t_rhh_email set ds_email = '%s' where id_candidato = %s", e.getEmail(), c.getId_candidato());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ExcluirEmail(int id_candidato) {
		String query = String.format("delete from t_rhh_email where id_candidato = %s", id_candidato);
		
		Dao.InsertUpdateDeleteCommand(query);
	}

}
