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
}
