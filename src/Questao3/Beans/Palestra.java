package Questao3.Beans;

import java.time.LocalDateTime;
import java.util.List;

public class Palestra {
	public Long id;
	public String titulo;
	public Palestrante palestrante;
	public String descricao;
	public List<Avaliacao> avaliacoes;
	public LocalDateTime datahora;
	public String local;
	public String trilha;

	public Palestra(){

	}
	
	public Palestra(Long id, String titulo, Palestrante palestrante, String descricao, List<Avaliacao> avaliacoes,
			LocalDateTime datahora, String local, String trilha) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.palestrante = palestrante;
		this.descricao = descricao;
		this.avaliacoes = avaliacoes;
		this.datahora = datahora;
		this.local = local;
		this.trilha = trilha;
	}

	public double mediaNotas(List<Avaliacao> avaliacao){
		double media = 0;
		double soma = 0;
		int qtNotas = avaliacao.size();
		for(int i=0;i<avaliacao.size();i++){
			soma = soma+avaliacao.get(i).getNota();
		}
		media = soma/qtNotas;
		return media;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Palestrante getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}

	public void setDatahora(LocalDateTime datahora) {
		this.datahora = datahora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTrilha() {
		return trilha;
	}

	public void setTrilha(String trilha) {
		this.trilha = trilha;
	}
}
