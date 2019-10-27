package Questao3.Dados;

import Questao3.Beans.Palestrante;
import Questao3.Beans.Participante;
import Questao3.Beans.Pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoa extends Pessoa {
	private static RepositorioPessoa pessoas;
	private ArrayList<Pessoa> pessoasArray;

	private RepositorioPessoa() {
		super();
		this.pessoasArray = new ArrayList<>();
	}

	public static RepositorioPessoa getInstance(){
		if(pessoas ==null){
			pessoas = new RepositorioPessoa();
		}
		return pessoas;
	}

	public boolean verificarEmailPessoa(Pessoa p){
		boolean retorno = false;
		for(Pessoa f: pessoasArray){
			if(f.getEmail().equalsIgnoreCase(p.getEmail())){
				retorno = true;
			}
		}
		return retorno;
	}
	
	public void inserirPessoa(Pessoa p) {
		if(p!=null) {
				if(verificarEmailPessoa(p)) {
					System.out.println("Usuario j� cadastrado");
				}
				else {
					pessoasArray.add(p);
					System.out.println("Usuario cadastrado com sucesso");
				}
		}//if
	}


	public boolean verificarEmail(Palestrante p){
		boolean retorno = false;
		for(Pessoa f: pessoasArray){
			if(p.getEmail().equals(f.getEmail())){
				retorno = true;
			}
		}
		return retorno;
	}

	public Pessoa verificarExistencia(String email){
		Pessoa pessoa = null;
		for(Pessoa f: pessoasArray) {
			if(f.getEmail().equals(email)) {
				pessoa = f;
			}
			}
		return pessoa;
	}
	
	public void removerPessoa(String email) {
		if(email != null) {
			if(verificarExistencia(email)!=null) {
				pessoasArray.remove(verificarExistencia(email));
				System.out.println("Usuario removido com sucesso");
			}
		}
	}
	
	public Pessoa buscarPessoa(String email) {
		Pessoa retorno = null;
		if(email!=null) {
			for(Pessoa f: pessoasArray) {
				if(f.getEmail().equals(email)) {
					retorno = f;
				}
			}
		}
		return retorno;
	}
	
	public List<Palestrante> listarPalestrantePorEmpresa(String empresa){
		List<Palestrante> palestrantesEmpresa = new ArrayList<>();
		if(empresa!=null) {
			for(Pessoa f: pessoasArray) {
				if((f instanceof  Palestrante && ((Palestrante) f).getEmpresa().equalsIgnoreCase(empresa))){
						palestrantesEmpresa.add((Palestrante) f);
				}
			}
		}
		return palestrantesEmpresa;
	}
	
	public List<Participante> listarParticipanteComInteresseEm(String interesse){
		List<Participante> participantesInteressados = new ArrayList<>();
		if(interesse!=null) {
			for(Pessoa f: pessoasArray) {
				if(((Participante) f).getInteresses().equals(interesse)) {
					participantesInteressados.add((Participante) f);
				}
			}//for
		}//if
		return participantesInteressados;
	}
	
	public List<Pessoa> listarParticipanteComIdadeMaiorQue(int idade){
		List<Pessoa> participantesAcimaDe = new ArrayList<>();
		LocalDate agora = LocalDate.now();
		for(Pessoa f: pessoasArray) {
			if(Period.between(f.getDataNasc(),agora).getYears()>=idade) {
				participantesAcimaDe.add(f);
			}
		}//for
		return participantesAcimaDe;
	}
	
	
}
