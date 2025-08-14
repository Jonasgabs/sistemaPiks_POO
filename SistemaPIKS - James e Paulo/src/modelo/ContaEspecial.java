/**
 * SI - POO - Prof. Fausto Ayres
 *
 */
package modelo;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(int limite) {
		super();
		this.limite = limite;
	}
	
	public void debitar(double valor) {
		this.saldo -= valor;
	}

}
