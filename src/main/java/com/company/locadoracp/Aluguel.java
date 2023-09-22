package com.company.locadoracp;

/**
 *
 * @author Erlison
 */
public class Aluguel {
    private Fita fita;
    private int diasAlugado;
    private Cliente cliente;

    public Aluguel(Fita fita, int diasAlugado,Cliente cliente) {
        this.fita = fita;
        this.diasAlugado = diasAlugado;
        this.cliente = cliente;
    }

    public Fita getFita() {
        return fita;
    }

    public void setFita(Fita fita) {
        this.fita = fita;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public void setDiasAlugado(int diasAlugado) {
        this.diasAlugado = diasAlugado;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "fita=" + fita + ", diasAlugado=" + diasAlugado + ", cliente=" + cliente + '}';
    }
    
    
    
}
