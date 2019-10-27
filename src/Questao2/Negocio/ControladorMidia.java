package Questao2.Negocio;

import Questao2.Beans.Consumidor;
import Questao2.Beans.Midia;
import Questao2.Beans.Produtor;
import Questao2.Beans.Usuario;
import Questao2.Dados.RepositorioMidia;
import Questao2.Dados.RepositorioReproducaoMidia;
import Questao2.Dados.RepositorioUsuario;
import Questao2.Dados.ReproducaoMidia;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class ControladorMidia {
	private static ControladorMidia controlador;
	private RepositorioUsuario ru;
	private RepositorioMidia rm;
	private RepositorioReproducaoMidia rr;

	public ControladorMidia() {
		super();
		this.ru = RepositorioUsuario.getInstance();
		this.rm = RepositorioMidia.getInstance();
		this.rr = RepositorioReproducaoMidia.getInstance();
	}
	
	public static ControladorMidia getInstance(){
		if(controlador == null){
			controlador = new ControladorMidia();
		}
		return controlador;
	}

	public void cadastrarUsuario (Usuario u) {
		if(u!=null) {
			if(u instanceof Produtor) {
				if(((Produtor) u).getCategorias()!=null) {
					ru.cadastrarUsuario(u);
					
				}
				else {
				}
			}
			else {
				ru.cadastrarUsuario(u);
			}
		}
	}
	
	public void removerUsuario (Usuario u) {
		if(u!=null) {
			ru.removerUsuario(u);
		}
	}

	public List<Usuario> listarUsuariosIdadeAcimade(int idade) {
		return ru.listarUsuariosIdadeAcimade(idade);
	}

	public List<Usuario> listarUsuariosTipo(Class tipo) {
		return ru.listarUsuariosTipo(tipo);
	}

	public void cadastrarMidia(Midia m) {
		if(m != null) {
			rm.cadastrarMidia(m);
		}
		else {
		}
	}

	public List<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario) {
		return rr.listarReproducoesPorUsuario(usuario);
	}

	public List<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDate inicio,LocalDate fim) {
		return rr.listarReproducoesNoPeriodo(inicio, fim);
	}

	public List<ReproducaoMidia> listarReproducoesPorCategoria(List<String> categorias) {
		return rr.listarReproducoesPorCategoria(categorias);
	}

	public List<Midia> listarMidiaPorFaixaEtaria(int faixaEtaria) {
		return rm.listarMidiaPorFaixaEtaria(faixaEtaria);
	}

	public List<Midia> listarMidiaPorCategoria(String categoria) {
		return rm.listarMidiaPorCategoria(categoria);
	}

	public void removerMidia(Midia m) {
		if(m!=null)
		rm.removerMidia(m);
	}

	public void reproduzirMidia(Consumidor c, Midia m) {
		LocalDate now = LocalDate.now();
		if(c!=null&&m!=null) {
			if(Period.between(c.getDatanasc(),now).getYears()>=m.faixaEtaria) {
				rr.cadastrarReproducaoMidia(m,c,now);
			}
		}
	}
}
