package programa;

import model.Agenda_entrevista;
import model.Bot;
import model.Candidato;
import model.Curriculo;
import model.Descri_vaga;
import model.Email;
import model.Empresa;
import model.Endereco;
import model.Rh;
import model.Telefone;
import model.Vaga;
import service.AgendaService;
import service.BotService;
import service.CandidatoService;
import service.CurriculoService;
import service.DescriService;
import service.EmailService;
import service.EmpresaService;
import service.EnderecoService;
import service.RhService;
import service.TelefoneService;
import service.VagaService;

public class Porgrama {

	public static void main(String[] args) {
		Candidato ca = new Candidato(1, "Lucas", "99744581568", 331204800, "11/01/2004", "M");
		CandidatoService.InserirCandidato(ca);
		
		Email e = new Email("luksmnt1101@gmail.com", "A");
		EmailService.InserirEmail(ca, e);
		
		Telefone t = new Telefone(55, 11, 981109608);
		TelefoneService.InserirTelefone(t, ca);
		
		Endereco en = new Endereco("Rua Lauzane", 823, "04782010", "1A", "São Paulo", "São Paulo");
		EnderecoService.InserirEndereco(en, ca);
		
		Curriculo c = new Curriculo("Superior", "FIAP", "ADS", "Cursando");
		CurriculoService.InserirCurriculo(c, ca);
		
		Empresa em = new Empresa(1010, "IBM");
		EmpresaService.InserirEmpresa(em);
		
		Bot b = new Bot(10, "Alfredo");
		BotService.InserirBot(b, em, ca);
		
		
		Endereco ene = new Endereco("Av Lins de Vasconceles", 200, "01234010", "200", "São Paulo", "São Pualo");
		EnderecoService.InserirEnderecoEmpresa(ene, em);
		
		Rh r = new Rh(0023, "Rogério", "11/01/1990");
		RhService.InserirRh(r, em);
		
		Descri_vaga dv = new Descri_vaga(120, "Ensino Médio Completo", "6h", "10/10/2022", "Indefinido", 100);
		DescriService.InserirDescricao(dv, em);
		
		Vaga v = new Vaga(1, "Full-Stack", "A");
		VagaService.InserirVaga(em, r, v);
		
		Agenda_entrevista ae = new Agenda_entrevista("Online", "10/10/2022", "14:30");
		AgendaService.InserirEntrevista(ae, r);
		
	}

}
