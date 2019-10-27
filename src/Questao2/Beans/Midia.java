package Questao2.Beans;

import java.time.LocalDate;

public class Midia {
	public LocalDate horaUpload;
	public String arquivo;
	public int faixaEtaria;
	public String categoria;
	public Produtor produtor;
	
	
	
	public Midia(LocalDate horaUpload, String arquivo, int faixaEtaria, String categoria, Produtor produtor) {
		super();
		this.horaUpload = horaUpload;
		this.arquivo = arquivo;
		this.faixaEtaria = faixaEtaria;
		this.categoria = categoria;
		this.produtor = produtor;
	}
	
	public LocalDate getHoraUpload() {
		return horaUpload;
	}
	public void setHoraUpload(LocalDate horaUpload) {
		this.horaUpload = horaUpload;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Produtor getProdutor() {
		return produtor;
	}
	public void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}
	
	
}
