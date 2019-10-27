package Questao2.Dados;

import Questao2.Beans.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuario extends Usuario {
	private static RepositorioUsuario usuarios;
	private ArrayList<Usuario> usuariosArray;

	private RepositorioUsuario() {
		super();
		this.usuariosArray = new ArrayList<>();
	}
	
	public static RepositorioUsuario getInstance(){
		if(usuarios == null){
			usuarios = new RepositorioUsuario();
		}
		return usuarios;
	}

	public boolean verificarEmail(Usuario u){
		boolean retorno = false;
		for(Usuario f: usuariosArray){
			if(u.getEmail().equals(f.getEmail())){
				retorno=true;
			}
		}
		return retorno;
	}


	
	public void cadastrarUsuario(Usuario u) {
			if(u!=null) {
					if (verificarEmail(u)) {
						System.out.println("Email j� est� sendo utilizado");
					} else{
					usuariosArray.add(u);
					System.out.println("Usuario cadastrado com sucesso");
				}
			}
	}
	
	public void removerUsuario(Usuario u) {
				usuariosArray.remove(u);
	}
	
	public List<Usuario> listarUsuariosIdadeAcimade(int idade){
		List<Usuario> usuariosacima = new ArrayList<>();
		LocalDate now = LocalDate.now();
		for(Usuario f: usuariosArray) {
			if(Period.between(f.getDatanasc(),now).getYears()>idade) {
				usuariosacima.add(f);
			}
		}
		return usuariosacima;
	}
	
	public List<Usuario> listarUsuariosTipo(Class tipo){
		List<Usuario> usuariostipo = new ArrayList<>();
		for(Usuario f: usuariosArray) {
			if(f.getClass().equals(tipo)) {
				usuariostipo.add(f);
			}
		}
		return usuariostipo;
	}

}
