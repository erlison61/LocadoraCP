package com.company.locadoracp;

/**
 *
 * @author Erlison
 */
public class LocadoraCP {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juliana");
        
        LocadoraController lc = new LocadoraController();
        
        lc.adicionarAluguel(new FitaNormal(2, "Men in Black "), 2, c1);
        
        
        System.out.println(lc.extrato(c1));
    }
}
