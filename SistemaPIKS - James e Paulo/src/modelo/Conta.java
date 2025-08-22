/**
 * SI - POO - Prof. Fausto Ayres
 *
 */

package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Conta {
    protected int id;
    protected String chavepiks;
    protected double saldo;
    protected Cliente cliente;
    protected ArrayList<Lancamento> lancamentos;

    public Conta(int id, String chavepiks, double saldo) {
        this.id = id;
        this.chavepiks = chavepiks;
        this.saldo = saldo;
        this.lancamentos = new ArrayList<>();
    }

    public Conta(int id, String chavepiks) {
        this.id = id;
        this.chavepiks = chavepiks;
        this.saldo = 0.0;
        this.lancamentos = new ArrayList<>();
    }
    
    public void creditar(double valor) {
        this.saldo += valor;
        Lancamento lanc = new Lancamento(LocalDateTime.now(), valor, "+");
        this.adicionar(lanc);
    }

    public void debitar(double valor) {
        if (this.saldo < valor) {
            throw new RuntimeException("Operação não permitida: Saldo insuficiente.");
        }
        this.saldo -= valor;
        Lancamento lanc = new Lancamento(LocalDateTime.now(), valor, "-");
        this.adicionar(lanc);
    }
    
    
    public void adicionar(Lancamento lanc) {
        this.lancamentos.add(lanc);
    }

    public void transferir(Conta destino, double valor) {
        if (this.equals(destino)) {
            throw new RuntimeException("Operação não permitida: A conta de destino não pode ser a mesma da origem.");
        }
        this.debitar(valor);
        destino.creditar(valor);
    }
    
    public int getId() {
        return id;
    }
    
    public String getChavePiks() {
        return chavepiks;
    }
    
    public void setChavePiks(String chave) {
        this.chavepiks = chave;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cli) {
        this.cliente = cli;
    }

    public ArrayList<Lancamento> getLancamentos() {
        return lancamentos;
    }

    @Override
    public String toString() {
        String dadosCliente = (this.cliente != null) ? 
                              "cpf=" + this.cliente.getCpf() + ", nome=" + this.cliente.getNome() : 
                              "cliente não associado";
        
        return "Conta [id=" + id + ", chavePiks=" + chavepiks + ", saldo=" + String.format("%.2f", saldo) + ", " + dadosCliente + "]";
    }
}