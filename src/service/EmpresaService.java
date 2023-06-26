package service;

import java.sql.ResultSet;

import dao.Dao;
import model.Empresa;

public class EmpresaService {
	public static void InserirEmpresa(Empresa e) {
		String query = String.format("insert into t_rhh_empresa(id_empresa,nm_empresa)values(%s,'%s')",e.getId_empresa(), e.getNm_empresa());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public void ExcluirEmpresa(int id_empresa) {
		String query = String.format("delete from t_rhh_empresa where id_empresa = %s", id_empresa);
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ListaEmpresa() {
		String query = "select * from t_rhh_empresa";
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_empresa")+" ");
				System.out.printf(rs.getString("nm_empresa")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void ListaEntrevista(int id_empresa) {
		String query = String.format("select * from t_rhh_empresa where id_empresa = '%s'", id_empresa);
		
		ResultSet rs = Dao.SelectCommand(query);
		
		try {
			while(rs.next()) {
				System.out.print(rs.getString("id_empresa")+" ");
				System.out.printf(rs.getString("nm_empresa")+" ");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}	
}
