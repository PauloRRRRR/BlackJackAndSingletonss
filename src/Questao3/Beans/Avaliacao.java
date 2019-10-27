package Questao3.Beans;

public class Avaliacao {
	private Palestra palestras;
	private int nota;
	private String comentario;
	private Participante avaliador;
	
	public Avaliacao(Palestra palestras, int nota, String comentario, Participante avaliador) {
		super();
		this.palestras = palestras;
		this.nota = nota;
		this.comentario = comentario;
		this.avaliador = avaliador;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Participante getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(Participante avaliador) {
		this.avaliador = avaliador;
	}

	public Palestra getPalestras() {
		return palestras;
	}

	public void setPalestras(Palestra palestras) {
		this.palestras = palestras;
	}
}
