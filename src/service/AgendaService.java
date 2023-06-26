package service;

import java.sql.ResultSet;

import dao.Dao;
import model.Agenda_entrevista;
import model.Rh;

public class AgendaService {
	public static void InserirEntrevista(Agenda_entrevista a, Rh r) {
		String query = String.format("insert into t_rhh_agen_entrevista (id_funcio,ds_local,dt_entre,hr_entre)values(%s,'%s','%s','%s')", r.getId_funcio(), a.getLocal(), a.getDt_entre(), a.getHr_entre());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void AtualizarEntrevista(Agenda_entrevista a, Rh r) {
		String query = String.format("update t_rhh_agen_entrevista set hr_entre = '%s' where id_funcio = %s", a.getHr_entre(), r.getId_funcio());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ExcluirEntrevista(int id_funcionario) {
		String query = String.format("delete from t_rhh_agen_entrevista where id_funcio = %s", id_funcionario);
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ListaEntrevista() {
		String query = "select * from t_rhh_agen_entrevista";
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_funcio")+" ");
				System.out.printf(rs.getString("ds_local")+" ");
				System.out.printf(rs.getString("dt_entre")+" ");
				System.out.printf(rs.getString("hr_entre")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void ListaEntrevista(int id_funcio) {
		String query = String.format("select * from t_rhh_agen_entrevista where id_funcio = '%s'", id_funcio);
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_funcio")+" ");
				System.out.printf(rs.getString("ds_local")+" ");
				System.out.printf(rs.getString("dt_entre")+" ");
				System.out.printf(rs.getString("hr_entre")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
