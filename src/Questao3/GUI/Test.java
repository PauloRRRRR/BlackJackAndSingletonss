package Questao3.GUI;

import Questao3.Beans.*;
import Questao3.Negocio.Controlador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Pessoa part1 = new Participante((long) 1234,"notadead","loki",LocalDate.of(1999,11,16),"Recife","Tecnologia");
		Pessoa part2 = new Participante((long)44444,"deadd","Ricardo",LocalDate.of(1998,10,10),"Recife","Economia Criativa");
		Pessoa part3 = new Participante((long)3333,"deadran","paulera",LocalDate.of(1990,9,9),"Recife","Cidades");
		Pessoa part4 = new Participante((long)5555555,"randead","rrricardo",LocalDate.of(1980,9,9),"Recife","Economia Criativa");
		Pessoa part5 = new Participante((long)363636,"brodead","pppaulo",LocalDate.of(2005,10,10),"Olinda","Tecnologia");
		Pessoa part6 = new Participante((long)45451,"deadbro","pauloooo",LocalDate.of(2008,10,10),"Olinda","Tecnologia");
		Pessoa part7 = new Participante((long)383838,"deadaton","ricardooo",LocalDate.of(2010,5,5),"Recife","Cidades");
		Pessoa part8 = new Participante((long)696867,"regentprince","paulao",LocalDate.of(1999,11,16),"Recife","Tecnologia");
		Pessoa pal2 = new Palestrante((long)12345,"notinha","coach1",LocalDate.of(1999,10,11),"Recife","PORTODIGITAL");
		Pessoa pal1 = new Palestrante((long)55555,"lecab","coach2",LocalDate.of(1999,9,10),"Olinda","PORTODIGITAL");
		Pessoa pal3 = new Palestrante((long)445454,"deadnota","coach3",LocalDate.of(2000,12,12),"Olinda","MICROSOFT");
		Pessoa pal4 = new Palestrante((long)213213,"notenha","coach4",LocalDate.of(1980,5,5),"Recife","GOOGLE");
		Pessoa pal5 = new Palestrante((long)32215,"aton","coach5",LocalDate.of(1970,11,10),"Recife","GOOGLE");
		List<Avaliacao> avaliacoes1 = new ArrayList<>();
		List<Avaliacao> avaliacoes2 = new ArrayList<>();
		List<Avaliacao> avaliacoes3 = new ArrayList<>();
		List<Avaliacao> avaliacoes4 = new ArrayList<>();
		List<Avaliacao> avaliacoes5 = new ArrayList<>();
		Palestra pa1 = new Palestra((long) 55555,"A inovação financeira e o sistema financeiro do futuro",(Palestrante) pal2," Palestra sobre como as inovações tecnológicas financeiras podem influenciar o sistema financeiro",avaliacoes1,LocalDateTime.of(2019, 10,2, 10, 00),"Teatro Apolo","TECNOLOGIA");

		Palestra pa2 = new Palestra((long)4545455,"Apresentação do Humanóide NAO",(Palestrante) pal1,"Nessa atividade os participantes assistirão a performance do NAO- humanóide programado por estudantes da rede municipal do Recife, am\n" +
				"apresentações de Yoga e Dança que serão contagiantes e motivarão a interação dos presentes.",avaliacoes2,LocalDateTime.of(2019,10,2,11,15),"Accenture Innovation Center"," Tecnologia");

		Palestra pa3 = new Palestra((long)666666,"Imprensa Mirim",(Palestrante) pal3," Durante o evento os palestrantes serão entrevistados como pauta da Cobertura jornalística das ações do Rec'n'Play , realizadas por\n" +
				"estudantes da Prefeitura de Recife. Muitos participantes poderão compor com os palestrantes as entrevistas prestando depoimentos sobre o\n" +
				"evento e suas impressões e novas aprendizagens.",avaliacoes3,LocalDateTime.of(2019,10,2,10,00),"Teatro Apolo","Economia Criativa");

		Palestra pa4 = new Palestra((long)77777,"Educação experimental para famílias empresárias",(Palestrante) pal4,"Uma conversa com os sócios e membros da Escola F para debater um novo modelo educacional voltado para famílias empresárias. Um modelo de\n" +
				"negócio colaborativo que valoriza a aprendizagem a partir da troca de experiências, investe na facilitação de grupos para gerar conhecimento e\n" +
				"desenvolvimento, por meio da construção de entendimentos e não apenas a partir de conteúdos externos.",avaliacoes4,LocalDateTime.of(2019,4,10,10,00),"CESAR Bom Jesus - Sala Garagem (5º andar)","Cidades");

		Palestra pa5 = new Palestra((long)88888," Como você e a sua empresa irão sobreviver ao apocalipse digital?",(Palestrante) pal5,"Talk Show com o renomado líder do setor de inovação que conversá sobre o tema de transformação digital.",avaliacoes5,LocalDateTime.of(2019,10,5,10,00),"Cais do Sertão - Auditório","Cidades");

		Controlador c = new Controlador();
		c.realizarInscricao(pal2);
		c.realizarInscricao(pal1);
		c.realizarInscricao(pal3);
		c.realizarInscricao(pal4);
		c.realizarInscricao(pal5);
		c.realizarInscricao(part2);
		c.realizarInscricao(part1);
		c.realizarInscricao(part3);
		c.realizarInscricao(part4);
		c.realizarInscricao(part5);
		c.realizarInscricao(part6);
		c.realizarInscricao(part7);
		c.realizarInscricao(part8);
		c.cadastrarPalestra(pa1);
		c.cadastrarPalestra(pa2);
		c.cadastrarPalestra(pa3);
		c.cadastrarPalestra(pa4);
		c.cadastrarPalestra(pa5);

		Avaliacao aval1 = new Avaliacao(pa1, 2, "Muitobom", (Participante) part1);
		Avaliacao aval2 = new Avaliacao(pa2,3,"Me",(Participante) part2);
		Avaliacao aval3 = new Avaliacao(pa3,4,"Er...",(Participante)part3);
		Avaliacao aval4 = new Avaliacao(pa4,5,"Aaaa",(Participante)part4);
		Avaliacao aval5 = new Avaliacao(pa5,5,"asf",(Participante)part5);
		Avaliacao aval6 = new Avaliacao(pa1,1,"Maravilho",(Participante)part6);
		Avaliacao aval7 = new Avaliacao(pa3,5,"eca",(Participante)part7);
		Avaliacao aval8 = new Avaliacao(pa1,2,"Muito bom",(Participante)part8);

		c.avaliarPalestra(aval1);
		c.avaliarPalestra(aval2);
		c.avaliarPalestra(aval3);
		c.avaliarPalestra(aval4);
		c.avaliarPalestra(aval5);
		c.avaliarPalestra(aval6);
		c.avaliarPalestra(aval7);
		c.avaliarPalestra(aval8);

		System.out.println(""+c.listarPalestrantePorEmpresa("PORTODIGITAL"));
		System.out.println(""+c.listarParticipanteComIdadeMaiorQue(39));
		System.out.println(""+c.listarPalestrasNessaMedia(2.5));
		System.out.println(""+pa1.getAvaliacoes());
	}

}
