/**
 * SI - POO - Prof. Fausto Ayres
 *
 */
package modelo;

public class Cliente {
	private int cpf;
	private String nome;
	private Conta conta;
	
	public Cliente(int cpf, String nome, Conta conta) {
		this.cpf = cpf;
		this.nome = nome;
		this.conta = conta;
	}
	
	public void setConta(Conta cta) {
		this.conta = cta;
	}
	
	public Conta getConta() {
		return this.conta;
	}
}
