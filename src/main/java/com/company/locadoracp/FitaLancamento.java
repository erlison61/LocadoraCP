package com.company.locadoracp;

/**
 *
 * @author Erlison
 */
public class FitaLancamento extends Fita{

    public FitaLancamento(int codigoDePreco, String titulo) {
        super(codigoDePreco, titulo, 2);
    }
    
    @Override 
    public double venderFita(Aluguel aluguel){
        return super.venderFita(aluguel) * 3;
    }
    
}
