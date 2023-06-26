package service;

import dao.Dao;
import model.Empresa;
import model.Rh;
import model.Vaga;

public class VagaService {
	public static void InserirVaga(Empresa e, Rh r, Vaga v) {
		String query = String.format("insert into t_rhh_vaga(id_empresa,id_funcio,id_vaga,nm_area_vaga,st_vaga)values(%s,'%s','%s','%s','%s')", e.getId_empresa(), r.getId_funcio(), v.getId_vaga(), v.getNm_area(), v.getSt_vaga());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public void AtualizarVaga(Vaga v, Empresa e) {
		String query = String.format("update t_rhh_vaga set st_vaga = '%s' where id_empresa = %s", v.getSt_vaga(), e.getId_empresa());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ExcluirVaga(int id_vaga) {
		String query = String.format("delete from t_rhh_vaga where id_vaga = %s", id_vaga);
		
		Dao.InsertUpdateDeleteCommand(query);
	}
}
