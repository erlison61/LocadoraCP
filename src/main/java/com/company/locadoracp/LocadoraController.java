package com.company.locadoracp;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Erlison
 */
public class LocadoraController {
    private final List<Aluguel> fitasAlugadas;
    private int pontosDeAlugadorFrequente;
    
    public LocadoraController() {
        this.fitasAlugadas = new ArrayList<>();
        this.pontosDeAlugadorFrequente = 0;
    }
    
    public void adicionarAluguel(Fita fita, int diasAlugados, Cliente cliente){
        fitasAlugadas.add(new Aluguel(fita, diasAlugados, cliente));
    }
    
    public String extrato(Cliente cliente){
        
        
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        

        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;

        for (Aluguel cada : fitasAlugadas) {
            Fita fita = cada.getFita();
            double valorCorrente = fita.venderFita(cada);

            // Trate de pontos de alugador frequente
            setPontosDeAlugadorFrequente(pontosDeAlugadorFrequente + 1);
            

            // Adicione bônus para aluguel de um lançamento por pelo menos 2 dias
            if (cada.getFita() instanceof FitaLancamento && cada.getDiasAlugado() > 1) setPontosDeAlugadorFrequente(this.pontosDeAlugadorFrequente + 1);
            

            // Mostra valores para este aluguel
            resultado += "\t" + fita.getTitulo() + "\t" + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        }

        // Adicione rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Você acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
        
        return resultado;


    }

    public int getPontosDeAlugadorFrequente() {
        return pontosDeAlugadorFrequente;
    }

    public void setPontosDeAlugadorFrequente(int pontosDeAlugadorFrequente) {
        this.pontosDeAlugadorFrequente = pontosDeAlugadorFrequente;
    }
    
    
    
}
