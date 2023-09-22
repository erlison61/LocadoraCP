package com.company.locadoracp;

/**
 *
 * @author Erlison
 */
public abstract class Fita {
    private final int codigoDePreco;
    private  String titulo;
    private double valorConcorrente;

    public Fita(int codigoDePreco, String titulo, double valorConcorrente) {
        this.codigoDePreco = codigoDePreco;
        this.titulo = titulo;
        this.valorConcorrente = valorConcorrente;
    }
    
    public double venderFita(Aluguel aluguel){
        return getValorConcorrente() + (aluguel.getDiasAlugado() - 2);
    }

    public double getValorConcorrente() {
        return valorConcorrente;
    }

    public void setValorConcorrente(double valorConcorrente) {
        this.valorConcorrente = valorConcorrente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    @Override
    public String toString() {
        return "Fita{" + "codigoDePreco=" + codigoDePreco + ", titulo=" + titulo + ", valorConcorrentes=" + valorConcorrente + '}';
    }
    
    
    
    
}
