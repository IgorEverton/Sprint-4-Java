package service;

import dao.Dao;
import model.Rh;
import model.Empresa;

public class RhService {
	public static void InserirRh(Rh r, Empresa e) {
		String query = String.format("insert into t_rhh_funcionario_rh(id_empresa,id_funcio,nm_funcio,dt_nasc)values(%s,'%s','%s','%s')", e.getId_empresa(), r.getId_funcio(), r.getNome_funcio(), r.getDt_nasc());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
}	
