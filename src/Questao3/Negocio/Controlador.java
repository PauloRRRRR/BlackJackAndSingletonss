package Questao3.Negocio;

import Questao3.Beans.*;
import Questao3.Dados.RepositorioPalestra;
import Questao3.Dados.RepositorioPessoa;

import java.util.List;

public class Controlador {
	private RepositorioPessoa rpessoas;
	private RepositorioPalestra rpalestras;
	
	public Controlador() {
		this.rpessoas = RepositorioPessoa.getInstance();
		this.rpalestras = RepositorioPalestra.getInstance();
	}
	
	public static RepositorioPessoa getInstance() {
		return RepositorioPessoa.getInstance();
	}

	public RepositorioPessoa getRpessoas() {
		return rpessoas;
	}

	public void setRpessoas(RepositorioPessoa rpessoas) {
		this.rpessoas = rpessoas;
	}

	public RepositorioPalestra getRpalestras() {
		return rpalestras;
	}

	public void setRpalestras(RepositorioPalestra rpalestras) {
		this.rpalestras = rpalestras;
	}

	public void inserirPessoa(Pessoa p) {
		rpessoas.inserirPessoa(p);
	}

	public boolean verificarEmail(Palestrante p) {
		return rpessoas.verificarEmail(p);
	}

	public Pessoa verificarExistencia(String email) {
		return rpessoas.verificarExistencia(email);
	}

	public void removerPessoa(String email) {
		rpessoas.removerPessoa(email);
	}

	public Pessoa buscarPessoa(String email) {
		return rpessoas.buscarPessoa(email);
	}

	public List<Palestrante> listarPalestrantePorEmpresa(String empresa) {
		return rpessoas.listarPalestrantePorEmpresa(empresa);
	}

	public List<Participante> listarParticipanteComInteresseEm(String interesse) {
		return rpessoas.listarParticipanteComInteresseEm(interesse);
	}

	public List<Pessoa> listarParticipanteComIdadeMaiorQue(int idade) {
		return rpessoas.listarParticipanteComIdadeMaiorQue(idade);
	}

	public void realizarInscricao(Pessoa p) {
			if(p instanceof Participante) {
				if(((Participante) p).getInteresses().isEmpty()) {
				}//if
				else if(((Participante) p).getInteresses().equalsIgnoreCase("TECNOLOGIA")||((Participante) p).getInteresses().equalsIgnoreCase("ECONOMIA_CRIATIVA")||((Participante) p).getInteresses().equalsIgnoreCase("CIDADES")) {
					rpessoas.inserirPessoa(p);
				}//else if
			
			}
			else {
				rpessoas.inserirPessoa(p);
			}
	}//realizarInscricao
	
	public void cadastrarPalestra(Palestra p) {
		if(p!=null) {
			if(this.rpessoas.verificarEmail((p.getPalestrante()))) {
				for(int i=0;i<this.rpalestras.listarPalestras().size();i++) {
					if(p.titulo.equalsIgnoreCase(this.rpalestras.listarPalestras().get(i).titulo)) {
					}//if
					else if(!p.getDatahora().isEqual(this.rpalestras.listarPalestras().get(i).getDatahora())){
						if(p.getPalestrante().getEmpresa()!=null) {
							this.rpessoas.inserirPessoa(p.getPalestrante());
							this.rpalestras.inserirPalestra(p);
						}
					}//elseif
				}//for
			}//if
		}
	}//cadastrarPalestra
	
	public void avaliarPalestra(Avaliacao aval) {
		if(this.rpessoas.buscarPessoa(aval.getAvaliador().getEmail())!=null) {
			if(aval.getNota()>=0&&aval.getNota()<=5) {
				aval.getPalestras().avaliacoes.add(aval);
			}//if
		}//if
	}//avaliarPalestra

	public List<Palestra> listarPalestrasNessaMedia(double media) {
		return rpalestras.listarPalestrasNessaMedia(media);
	}
}
