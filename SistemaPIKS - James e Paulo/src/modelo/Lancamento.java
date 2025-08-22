package modelo;

import java.time.LocalDateTime;

public class Lancamento {
	private LocalDateTime datahora;
	private double valor;
	private String tipo;
	
	public Lancamento(LocalDateTime datahora, double valor, String tipo) {
		this.datahora = datahora;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public LocalDateTime getDatahora() {
		return this.datahora;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	@Override
	public String toString() {


		return "Lançamento [datahora=" + datahora + ", valor=" + String.format("%.2f", valor) + ", tipo=" + tipo + "]";
	}
}
