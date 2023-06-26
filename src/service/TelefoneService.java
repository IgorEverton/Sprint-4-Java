package service;

import dao.Dao;
import model.Telefone;
import model.Candidato;

public class TelefoneService {
	public static void InserirTelefone(Telefone t, Candidato c) {
		String query = String.format("insert into t_rhh_telefone(id_candidato,nr_ddi,nr_ddd,nr_telefone)values(%s,'%s','%s','%s')", c.getId_candidato(), t.getDdi(), t.getDdd(), t.getNumero());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public void AtualizarTelefone(Telefone t, Candidato c) {
		String query = String.format("update t_rhh_telefone set nr_telefone = '%s' where id_candidato = %s", t.getNumero(), c.getId_candidato());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ExcluirTelefone(int id_candidato) {
		String query = String.format("delete from t_rhh_telefone where id_candidato = %s", id_candidato);
		
		Dao.InsertUpdateDeleteCommand(query);
	}

}
