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
		this.nome = nome;
	}
	public Cliente(int cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		this.nome = nome;
	}
	
	public void setConta(Conta cta) {
		this.conta = cta;
	}
	
	public void setCpf(int novoCpf) {
		this.cpf = novoCpf;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
	public int getCpf() {
		return this.cpf;	
	}
	public String getNome() {
		return this.nome;
	}
	
	
	@Override
	public String toString() {
		String idConta = (this.conta != null) ? String.valueOf(this.conta.getId()) : "sem conta";
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", id_conta=" + idConta + "]";
	}
}
