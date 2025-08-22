/**
 * SI - POO - Prof. Fausto Ayres
 *
 */
package modelo;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(int id, String chavepiks, double saldo, double limite) {
		super(id, chavepiks, saldo);
		this.limite = limite;
	}
	
	public ContaEspecial(int id, String chavepiks, double limite) {
		super(id, chavepiks);
		this.limite = limite;
	} 
	
	@Override
	public void debitar(double valor) {
		if (this.saldo + this.limite >= valor) {
			this.saldo -= valor;
		} else {
			throw new RuntimeException("Operação não permitida: Saldo e limite insuficientes.");
		}
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double novoLimite) {
		this.limite = novoLimite;
	}
}
