package service;

import java.sql.ResultSet;

import dao.Dao;
import model.Curriculo;
import model.Candidato;

public class CurriculoService {
	public static void InserirCurriculo(Curriculo c, Candidato ca) {
		String query = String.format("insert into t_rhh_curriculo (id_candidato,st_escolaridade,nm_facul,ds_curso,st_gradua)values(%s,'%s','%s','%s','%s')", ca.getId_candidato(), c.getEscolaridade(), c.getNome_facul(), c.getDescricao_curso(), c.getStatus_gradu());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public void AtualizarCurriculo(Curriculo c, Candidato ca) {
		String query = String.format("update t_rhh_curriculo set st_escolaridade = '%s' where id_candidato = %s", c.getEscolaridade(), ca.getId_candidato());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ExcluirCurriculo(int id_candidato) {
		String query = String.format("delete from t_rhh_curriculo where id_candidato = %s", id_candidato);
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ListaEntrevista() {
		String query = "select * from t_rhh_curriulo";
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_candidato")+" ");
				System.out.printf(rs.getString("st_escolaridade")+" ");
				System.out.printf(rs.getString("nm_facul")+" ");
				System.out.printf(rs.getString("ds_curso")+" ");
				System.out.printf(rs.getString("st_gradua")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void ListaEntrevista(int id_candidato) {
		String query = String.format("select * from t_rhh_curriulo where id_candidato = '%s'", id_candidato);
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_candidato")+" ");
				System.out.printf(rs.getString("st_escolaridade")+" ");
				System.out.printf(rs.getString("nm_facul")+" ");
				System.out.printf(rs.getString("ds_curso")+" ");
				System.out.printf(rs.getString("st_gradua")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
