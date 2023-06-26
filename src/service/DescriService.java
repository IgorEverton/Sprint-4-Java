package service;

import dao.Dao;
import model.Descri_vaga;
import model.Empresa;

public class DescriService {
	public static void InserirDescricao(Descri_vaga d, Empresa e) {
		String query = String.format("insert into t_rhh_descri_vaga (id_empresa,nr_salario,ds_requis,dt_carga_hr,dt_inicio,dt_fim,qtd_vaga)values(%s,'%s','%s','%s','%s','%s','%s')",e.getId_empresa(), d.getSalario(), d.getRequisitos(), d.getCarga_hr(), d.getDt_inicio(), d.getDt_fim(), d.getQtd_vaga());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void AtualizarSalarioario(Empresa e, Descri_vaga d) {
		String query = String.format("update t_rhh_descri_vaga set nr_salario = '%2f' where id_empresa = %s", d.getSalario(), e.getId_empresa());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public void AtualizarRequisitos(Empresa e, Descri_vaga d) {
		String query = String.format("update t_rhh_descri_vaga set ds_requis = '%s' where id_empresa = %s", d.getRequisitos(), e.getId_empresa());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
}
