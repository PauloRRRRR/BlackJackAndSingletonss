package Questao2.GUI;

import Questao2.Beans.Consumidor;
import Questao2.Beans.Midia;
import Questao2.Beans.Produtor;
import Questao2.Beans.Usuario;
import Questao2.Negocio.ControladorMidia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> categorias = new ArrayList<String>(10);
	    categorias.add("NTR");
	    categorias.add("BDSM");
	    categorias.add("Harem");
	    categorias.add("Ahegao");
	    ArrayList<String> categorias1 = new ArrayList<String>(10);
	    categorias1.add("Shonen");
	    categorias1.add("Aventura");
	    categorias1.add("Acao");
	    ControladorMidia cm = ControladorMidia.getInstance();
	    Usuario p1 = new Produtor("canal1",categorias,"produtor1","emailprodutor1",LocalDate.of(1999, 11, 16));
	    Usuario p2 = new Produtor("canal2",categorias1,"produtor2","emailprodutor2",LocalDate.of(2000, 11, 16));
	    Usuario p3 = new Produtor("canal3",categorias,"produtor3","emailprodutor3",LocalDate.of(2001, 11, 16));
	    
	    Usuario c1 = new Consumidor(categorias,"notadead","paulo",LocalDate.of(1999, 11, 16));
	    Usuario c2 = new Consumidor(categorias1,"nota","ricardo",LocalDate.of(2000, 11, 16));
	    Usuario c3 = new Consumidor(categorias,"aton","paulao",LocalDate.of(2004, 11, 16));
	    Usuario c4 = new Consumidor(categorias1,"asdsfgh","paulinho",LocalDate.of(1980, 11, 16));
	    Usuario c5 = new Consumidor(categorias,"email1","nome1",LocalDate.of(2008, 11, 16));
	    Usuario c6 = new Consumidor(categorias1,"email2","nome2",LocalDate.of(2014, 11, 16));
	    Usuario c7 = new Consumidor(categorias,"email3","nome3",LocalDate.of(2007, 11, 16));
	    
	    Midia m1 = new Midia(LocalDate.of(2018, 11, 16),"Minecraft gameplay",14,"NTR",(Produtor) p1);
	    Midia m2 = new Midia(LocalDate.of(2019, 8, 10),"Nome aleatorio de video",18,"Shonen",(Produtor) p1);
	    Midia m3 = new Midia(LocalDate.of(2018, 10, 10),"Video 3",16,"Shonen",(Produtor) p2);
	    Midia m4 = new Midia(LocalDate.of(2016, 5, 11),"Video 4",5,"Aventura",(Produtor) p2);
	    Midia m5 = new Midia(LocalDate.of(2010, 5, 10),"Video 5",10,"Acao",(Produtor) p2);
	    Midia m6 = new Midia(LocalDate.of(2005, 4, 4),"Video 6",10,"Acao",(Produtor) p3);
	    Midia m7 = new Midia(LocalDate.of(2008, 5, 5),"Video 6",17,"BDSM",(Produtor) p3);
	    Midia m8 = new Midia(LocalDate.of(2018, 10, 10),"Video 7",17,"BDSM",(Produtor) p3);
	    cm.cadastrarUsuario(p1);
	    cm.cadastrarUsuario(p2);
	    cm.cadastrarUsuario(p3);
	    cm.cadastrarUsuario(c1);
	    cm.cadastrarUsuario(c3);
	    cm.cadastrarUsuario(c5);
	    cm.cadastrarUsuario(c6);
	    cm.cadastrarUsuario(c7);
	    cm.cadastrarUsuario(c4);
	    cm.cadastrarUsuario(p3);
	    cm.cadastrarUsuario(c2);
	    cm.removerUsuario(c7);
		System.out.println(""+cm.listarUsuariosIdadeAcimade(16));
		cm.cadastrarMidia(m1);
		cm.cadastrarMidia(m2);
		cm.cadastrarMidia(m3);
		cm.cadastrarMidia(m4);
		cm.cadastrarMidia(m5);
		cm.cadastrarMidia(m6);
		cm.cadastrarMidia(m7);
		cm.cadastrarMidia(m8);
		cm.removerMidia(m8);

		System.out.println(""+cm.listarMidiaPorFaixaEtaria(14));
		System.out.println(""+cm.listarMidiaPorCategoria("Acao"));

		cm.reproduzirMidia((Consumidor)c6,m1);
		cm.reproduzirMidia((Consumidor)c2,m2);
		cm.reproduzirMidia((Consumidor)c2,m4);
		cm.reproduzirMidia((Consumidor)c3,m5);
		cm.reproduzirMidia((Consumidor)c3,m3);
		cm.reproduzirMidia((Consumidor)c6,m7);
		cm.reproduzirMidia((Consumidor)c1,m3);
		cm.reproduzirMidia((Consumidor)c3,m6);
		cm.reproduzirMidia((Consumidor)c5,m5);
		cm.reproduzirMidia((Consumidor)c5,m1);
		cm.reproduzirMidia((Consumidor)c4,m2);
		cm.reproduzirMidia((Consumidor)c4,m4);
		cm.reproduzirMidia((Consumidor)c4,m6);
		cm.reproduzirMidia((Consumidor)c6,m6);
		cm.reproduzirMidia((Consumidor)c6,m3);
		cm.reproduzirMidia((Consumidor)c2,m6);
		cm.reproduzirMidia((Consumidor)c2,m5);
		cm.reproduzirMidia((Consumidor)c1,m4);
		cm.reproduzirMidia((Consumidor)c1,m5);
		cm.reproduzirMidia((Consumidor)c1,m6);

		System.out.println(""+cm.listarReproducoesNoPeriodo(LocalDate.of(2018,1,1),LocalDate.of(2019,12,30)));
		cm.listarReproducoesPorUsuario((Consumidor)c3);
		System.out.println(""+cm.listarReproducoesNoPeriodo(LocalDate.of(2014,1,1),LocalDate.of(2019,12,30)));
		System.out.println(""+cm.listarMidiaPorCategoria("Acao"));
	}

}
