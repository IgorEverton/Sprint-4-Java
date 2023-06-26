package service;

import dao.Dao;
import model.Endereco;
import model.Candidato;
import model.Empresa;

public class EnderecoService {
	public static void InserirEndereco(Endereco e, Candidato c) {
		String query = String.format("insert into t_rhh_endereco(id_candidato,nm_logradouro,nr_logradouro,nr_cep,ds_comple,nm_estado,nm_cidade)values(%s,'%s','%s','%s','%s','%s','%s')", c.getId_candidato(), e.getNome_rua(), e.getNum_rua(), e.getCep(), e.getComple(), e.getEstado(), e.getCidade());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	public static void InserirEnderecoEmpresa(Endereco e, Empresa em) {
		String query = String.format("insert into t_rhh_endereco(id_candidato,nm_logradouro,nr_logradouro,nr_cep,ds_comple,nm_estado,nm_cidade)values(%s,'%s','%s','%s','%s','%s','%s')", em.getId_empresa(), e.getNome_rua(), e.getNum_rua(), e.getCep(), e.getComple(), e.getEstado(), e.getCidade());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
}
