package service;

import dao.Dao;
import model.Bot;
import model.Empresa;
import model.Candidato;

public class BotService {
	public static void InserirBot(Bot b, Empresa e, Candidato ca) {
		String query = String.format("insert into t_rhh_bot (id_empresa,id_candidato,id_bot,nm_bot)values(%s,'%s','%s','%s')", ca.getId_candidato(), e.getId_empresa(), b.getId_bot(), b.getNome_bot());
		
		Dao.InsertUpdateDeleteCommand(query);
	}
	
	public void ExcluirBot(int id_bot) {
		String query = String.format("delete from t_rhh_bot where id_bot = %s", id_bot);
		
		Dao.InsertUpdateDeleteCommand(query);
	}
}
