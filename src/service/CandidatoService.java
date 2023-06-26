package service;

import java.sql.ResultSet;

import dao.Dao;
import model.Candidato;

public class CandidatoService {
	public static void InserirCandidato(Candidato c) {
		String query = String.format("insert into t_rhh_candidato (id_candidato,nm_candidato,nr_cpf,nr_rg,dt_nasc,fl_sex_bio)values(%s,'%s','%s','%s','%s','%s')", c.getId_candidato(), c.getNm_candidato(), c.getCpf(), c.getRg(), c.getDtNasc(), c.getSexo());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public void AtualizarNome(Candidato c) {
		String query = String.format("update t_rhh_candidato set nm_candidato = '%s' where id_candidato = %s", c.getNm_candidato(), c.getId_candidato());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public void AtualizarSexo(Candidato c) {
		String query = String.format("update t_rhh_candidato set fl_sex_bio = '%s' where id_candidato = %s", c.getSexo(), c.getId_candidato());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ExcluirCandidato(int id_candidato) {
		String query = String.format("delete from t_rhh_candiadto where id_candidato = %s", id_candidato);
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ListaCandidato() {
		String query = "select * from t_rhh_candidato";
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_candidato")+" ");
				System.out.printf(rs.getString("nm_candidato")+" ");
				System.out.printf(rs.getString("nr_cpf")+" ");
				System.out.printf(rs.getString("nr_rg")+" ");
				System.out.printf(rs.getString("dt_nasc")+" ");
				System.out.printf(rs.getString("fl_sex_bio")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void ListaCandidato(int id_candidato) {
		String query = String.format("select * from t_rhh_candidato where id_candidato = '%s'", id_candidato);
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_candidato")+" ");
				System.out.printf(rs.getString("nm_candidato")+" ");
				System.out.printf(rs.getString("nr_cpf")+" ");
				System.out.printf(rs.getString("nr_rg")+" ");
				System.out.printf(rs.getString("dt_nasc")+" ");
				System.out.printf(rs.getString("fl_sex_bio")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
