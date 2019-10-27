package Questao2.Dados;

import Questao2.Beans.Consumidor;
import Questao2.Beans.Midia;

import java.time.LocalDate;
public class ReproducaoMidia {
	private Midia midia;
	private Consumidor consumidor;
	private LocalDate dataHoraReprod;
	
	public ReproducaoMidia(Midia midia, Consumidor consumidor, LocalDate dataHoraReprod) {
		super();
		this.midia = midia;
		this.consumidor = consumidor;
		this.dataHoraReprod = dataHoraReprod;
	}

	public ReproducaoMidia(){
		super();
	}
	
	public Midia getMidia() {
		return midia;
	}
	public void setMidia(Midia midia) {
		this.midia = midia;
	}
	public Consumidor getConsumidor() {
		return consumidor;
	}
	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}
	public LocalDate getDataHoraReprod() {
		return dataHoraReprod;
	}
	public void setDataHoraReprod(LocalDate dataHoraReprod) {
		this.dataHoraReprod = dataHoraReprod;
	}
	
	
}
