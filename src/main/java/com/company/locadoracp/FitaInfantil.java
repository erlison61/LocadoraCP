package com.company.locadoracp;

/**
 *
 * @author Erlison
 */
public class FitaInfantil extends Fita{

    public FitaInfantil(int codigoDePreco, String titulo, double valorConcorrente) {
        super(codigoDePreco,titulo,3.5);
    }
    
    @Override
    public double venderFita(Aluguel aluguel){
        return super.venderFita(aluguel) * 1.5;
    }
}
