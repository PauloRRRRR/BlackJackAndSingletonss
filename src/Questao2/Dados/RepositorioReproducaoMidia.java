package Questao2.Dados;
import Questao2.Beans.Consumidor;
import Questao2.Beans.Midia;
import Questao2.Beans.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositorioReproducaoMidia {
	private static RepositorioReproducaoMidia reproducoesmidia;
	private ArrayList<ReproducaoMidia> reproducoesmidiaArray;

	private RepositorioReproducaoMidia() {
        reproducoesmidiaArray = new ArrayList<>();
    }
	
	public static RepositorioReproducaoMidia getInstance(){
		if(reproducoesmidia == null){
			reproducoesmidia = new RepositorioReproducaoMidia();
		}
		return reproducoesmidia;
	}

    public boolean verificarMidia(ReproducaoMidia rm){
		boolean retorno =false;
		for(ReproducaoMidia f: reproducoesmidiaArray){
			if(f.equals(rm)){
				retorno = true;
			}
		}
		return retorno;
	}
	
	public void cadastrarReproducaoMidia(Midia m, Consumidor c, LocalDate data) {
		ReproducaoMidia rm = new ReproducaoMidia(m,c,data);
			if(verificarMidia(rm)) {
				System.out.println("Midia j� existe");
			}
			else {
				reproducoesmidiaArray.add(rm);
				System.out.println("Midia cadastrada com sucesso");
			}
	}

	public ReproducaoMidia retornarMidia(Consumidor usuario){
		ReproducaoMidia retorno = new ReproducaoMidia();
		for(ReproducaoMidia f: reproducoesmidiaArray){
			if(verificarUsuario(usuario)){
				retorno = f;
			}
		}
		return retorno;
	}

	public boolean verificarUsuario(Usuario u){
		boolean retorn = false;
		for(ReproducaoMidia f: reproducoesmidiaArray){
			if(u.equals(f.getConsumidor())){
				retorn = true;
			}
		}
		return retorn;
	}
	
	public List<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario){
		List<ReproducaoMidia> reproducoesUsuario = new ArrayList<>();
		for(ReproducaoMidia f: reproducoesmidiaArray){
			if(f.getConsumidor().equals(usuario)){
				reproducoesUsuario.add(f);
			}
		}
		return reproducoesUsuario;
	}
	
	public List<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDate inicio, LocalDate fim){
		List<ReproducaoMidia> midiasNoPeriodo = new ArrayList<>();
		for(ReproducaoMidia f: reproducoesmidiaArray) {
			if(verificarPeriodo(inicio,fim).getDataHoraReprod().isEqual(f.getDataHoraReprod())) {
				midiasNoPeriodo.add(f);
			}
		}
		return midiasNoPeriodo;
	}
	public ReproducaoMidia verificarPeriodo(LocalDate inicio, LocalDate fim) {
		ReproducaoMidia retorno = new ReproducaoMidia();
		for (ReproducaoMidia f : reproducoesmidiaArray) {
				if (f.getDataHoraReprod().isAfter(inicio) && f.getDataHoraReprod().isBefore(fim)) {
					retorno = f;
				}
		}
		return retorno;
	}
	
	public List<ReproducaoMidia> listarReproducoesPorCategoria(List<String> categorias){
		List<ReproducaoMidia> reproducoesMidia = new ArrayList<>();
		for(ReproducaoMidia f: reproducoesmidiaArray) {
			for(int i=0;i<categorias.size();i++)
			if(categorias.get(i).equals(f.getMidia().categoria)) {
				reproducoesMidia.add(f);
			}
		}
		return reproducoesMidia;
	}

	public ArrayList<ReproducaoMidia> getReproducoesmidiaArray() {
		return reproducoesmidiaArray;
	}
}
