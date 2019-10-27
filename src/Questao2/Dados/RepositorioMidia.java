package Questao2.Dados;

import Questao2.Beans.Midia;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMidia {
	private static RepositorioMidia midiasInstancia;
	private ArrayList<Midia> midiasArray;

	private RepositorioMidia() {
        super();
		this.midiasArray = new ArrayList<Midia>(50);
    }

	public static RepositorioMidia getInstance(){
		if(midiasInstancia == null){
			midiasInstancia = new RepositorioMidia();
		}
		return midiasInstancia;
	}

    public boolean verificarExistencia(Midia m){
		boolean retorno = false;
		for(Midia f: midiasArray){
			if(f.getArquivo().equalsIgnoreCase(m.getArquivo())){
				retorno = true;
			}
		}
		return retorno;
	}
	
	public void cadastrarMidia(Midia m) {
		if(m!=null) {
			if (verificarExistencia(m)) {
				System.out.println("Midia j� existe");
			} else {
				midiasArray.add(m);
				System.out.println("Midia cadastrada com sucesso");
			}
		}
	}
	
	public void removerMidia(Midia m) {
		midiasArray.remove(m);
	}
	
	public List<Midia> listarMidiaPorFaixaEtaria(int faixaEtaria){
		List<Midia> midiasFaixa = new ArrayList<>();
		for(Midia f: midiasArray) {
			if(f.getFaixaEtaria()<=faixaEtaria) {
				midiasFaixa.add(f);
			}
		}
		return midiasFaixa;
	}
	
	public List<Midia> listarMidiaPorCategoria(String categoria){
		List<Midia> midiasCategoria = new ArrayList<Midia>();
		for(Midia f: midiasArray) {
			if(categoria.equals(f.getCategoria())) {
				midiasCategoria.add(f);
			}
		}
		return midiasCategoria;
	}
	
	
}
