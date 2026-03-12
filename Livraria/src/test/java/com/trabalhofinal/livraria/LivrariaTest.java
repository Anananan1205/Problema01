package com.trabalhofinal.livraria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivrariaTest {

    @BeforeEach
    public void prepararTestes() {
        EstanteLivros.limparEstante();
    }
    
    @Test
    public void deveSomarDinheiroCorretamente() {
        Dinheiro valor1 = new Dinheiro(10.50f);
        Dinheiro valor2 = new Dinheiro(5.25f);
        
        Dinheiro resultado = valor1.somar(valor2);
        
        assertEquals("R$ 15,75", resultado.toString());
    }

    @Test
    public void naoDevePermitirDinheiroNegativo() {
        Exception erro = assertThrows(IllegalArgumentException.class, () -> {
            new Dinheiro(-5.0f);
        });
        
        assertEquals("O valor do livro não pode ser negativo!", erro.getMessage());
    }
    
    
//----------------------------------------------------------------------------------------
//CLASSE PESO
//----------------------------------------------------------------------------------------

    @Test
    public void deveSomarPesosCorretamente() {
        Peso peso1 = new Peso(1.5f);
        Peso peso2 = new Peso(0.7f);
        
        Peso resultado = peso1.somar(peso2);
        
        assertEquals("2,200 kg", resultado.toString());
    }

    @Test
    public void naoDevePermitirPesoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Peso(-1.0f);
        });
    }

    @Test
    public void deveVerificarSeNaoUltrapassaLimite() {
        Peso peso = new Peso(1.5f);
        
        assertTrue(peso.naoUltrapassa(2.0f));
        assertTrue(peso.naoUltrapassa(1.5f));
        assertFalse(peso.naoUltrapassa(1.0f));
    }

    @Test
    public void deveCalcularFracoesDe100gExcedentesCorretamente() {
        Peso peso = new Peso(1.25f);
        
        int fracoes = peso.obterFracoesDe100gAcimaDe(1.0f);
        
        assertEquals(3, fracoes);
    }
    
    @Test
    public void deveRetornarZeroFracoesSeEstiverDentroDoLimite() {
        Peso peso = new Peso(0.8f); 
        int fracoes = peso.obterFracoesDe100gAcimaDe(1.0f);
        assertEquals(0, fracoes);
    }
    
//-------------------------------------------------------------------------------
// CLASSE ESTANTE DE LIVROS
// ----------------------------------------------------------------------------------------

    @Test
    public void CalcularValorEPesoTotalDaEstante() {
        Livro livro1 = new Livro("Livro A", new Dinheiro(50f), new Peso(1.0f));
        Livro livro2 = new Livro("Livro B", new Dinheiro(30.5f), new Peso(0.5f));
        
        EstanteLivros.adicionarLivro(livro1);
        EstanteLivros.adicionarLivro(livro2);
        
        Dinheiro valorTotal = EstanteLivros.calcularValorTotal();
        Peso pesoTotal = EstanteLivros.calcularPesoTotal();
        
        assertEquals("R$ 80,50", valorTotal.toString());
        assertEquals("1,500 kg", pesoTotal.toString());
    }

    
//-------------------------------------------------------------------------------
// TESTES DE REGRAS DE FRETE
// ----------------------------------------------------------------------------------------
    @Test
    public void deveCalcularFretePACDentroDosLimites() {
        MenuPrincipal menu = new MenuPrincipal();
        
        EstanteLivros.limparEstante();
        EstanteLivros.adicionarLivro(new Livro("Livro Leve", new Dinheiro(10f), new Peso(0.5f)));
        assertEquals("R$ 10,00", menu.calcularFretePorTipo("PAC").toString());

        EstanteLivros.limparEstante();
        EstanteLivros.adicionarLivro(new Livro("Livro Médio", new Dinheiro(10f), new Peso(1.5f)));
        assertEquals("R$ 15,00", menu.calcularFretePorTipo("PAC").toString());
    }

    @Test
    public void deveCalcularFreteSedexComAdicional() {
        MenuPrincipal menu = new MenuPrincipal();
        
        EstanteLivros.limparEstante();
        EstanteLivros.adicionarLivro(new Livro("Livro Pesado", new Dinheiro(10f), new Peso(1.2f)));
        
        assertEquals("R$ 51,00", menu.calcularFretePorTipo("SEDEX").toString());
    }

    @Test
    public void deveGarantirQueRetiradaNaoTemCusto() {
        MenuPrincipal menu = new MenuPrincipal();
        EstanteLivros.adicionarLivro(new Livro("Qualquer Livro", new Dinheiro(10f), new Peso(10.0f)));
        
        assertEquals("R$ 0,00", menu.calcularFretePorTipo("RETIRADA").toString());
    }
}


// ----------------------------------------------------------------------------------------