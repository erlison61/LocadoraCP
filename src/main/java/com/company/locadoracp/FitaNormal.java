package com.company.locadoracp;

/**
 *
 * @author Erlison
 */
public class FitaNormal extends Fita{

    public FitaNormal(int codigoDePreco, String titulo) {
        super(codigoDePreco, titulo, 2);
    }
    
    @Override
    public double venderFita(Aluguel aluguel){
        return super.venderFita(aluguel) * 1.5;
    }

    
    
}
