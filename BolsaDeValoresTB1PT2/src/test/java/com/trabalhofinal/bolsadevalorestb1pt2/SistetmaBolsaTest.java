package com.trabalhofinal.bolsadevalorestb1pt2;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Optional;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class SistemaBolsaTest {

    @Test
    void precosComMesmoValorDevemSerIguais() {
        Preco p1 = new Preco("24.00");
        Preco p2 = new Preco("24.00");
        assertTrue(p1.isIgual(p2));
    }

    @Test
    void precosComValoresDiferentesNaoDevemSerIguais() {
        Preco p1 = new Preco("24.00");
        Preco p2 = new Preco("25.00");
        assertFalse(p1.isIgual(p2));
    }

    @Test
    void nomesIguaisDevemDarMatch() {
        Nome n1 = new Nome("PETR4");
        Nome n2 = new Nome("PETR4");
        assertTrue(n1.isIgual(n2));
    }

    @Test
    void deveDarMatchQuandoCompraEVendaTemOmesmoPreco() {
        LivroDeOfertas livro = new LivroDeOfertas();
        Preco precoAcordo = new Preco("24.00");
        Ordem venda = new Ordem(new Nome("Mariana"), TipoOrdem.VENDA, precoAcordo);
        Ordem compra = new Ordem(new Nome("Joaquim"), TipoOrdem.COMPRA, precoAcordo);
        
        Optional<Preco> matchVenda = livro.processar(venda);
        assertFalse(matchVenda.isPresent());
        
        Optional<Preco> matchCompra = livro.processar(compra);
        assertTrue(matchCompra.isPresent());
        assertTrue(matchCompra.get().isIgual(precoAcordo));
    }

    @Test
    void naoDeveDarMatchQuandoPrecosForemDiferentes() {
        LivroDeOfertas livro = new LivroDeOfertas();
        Ordem venda = new Ordem(new Nome("Mariana"), TipoOrdem.VENDA, new Preco("25.00"));
        Ordem compra = new Ordem(new Nome("Joaquim"), TipoOrdem.COMPRA, new Preco("24.00"));
        
        livro.processar(venda);
        Optional<Preco> matchCompra = livro.processar(compra);
        assertFalse(matchCompra.isPresent());
    }

    @Test
    void deveEncontrarMatchNaFilaDeOrdens() {
        FilaDeOrdens fila = new FilaDeOrdens();
        Preco precoAlvo = new Preco("15.50");
        Ordem ordemExistente = new Ordem(new Nome("Vendedor"), TipoOrdem.VENDA, precoAlvo);
        fila.add(ordemExistente);
        
        Ordem ordemNova = new Ordem(new Nome("Comprador"), TipoOrdem.COMPRA, precoAlvo);
        Optional<Ordem> match = fila.buscarMatch(ordemNova);
        assertTrue(match.isPresent());
    }

    @Test
    void deveDispararOrdemQuandoOPrecoAlvoForAtingido() {
        Acao acao = new Acao(new Nome("BBAS3"), new Preco("23.00"));
        Preco precoAlvo = new Preco("24.00");
        Ordem ordemMecanica = new Ordem(new Nome("Joaquim"), TipoOrdem.COMPRA, new Preco("23.50"));
        Gatilho gatilho = new Gatilho(acao, precoAlvo, ordemMecanica);
        
        boolean disparouAntes = gatilho.checar(new Nome("BBAS3"), new Preco("23.50"));
        assertFalse(disparouAntes);
        
        boolean disparouNoAlvo = gatilho.checar(new Nome("BBAS3"), new Preco("24.00"));
        assertTrue(disparouNoAlvo);
    }

    static class FakeInvestidor implements Observer {
        boolean foiNotificado = false;
        @Override
        public void aoAtualizarPreco(Nome acao, Preco novoPreco) {
            this.foiNotificado = true;
        }
    }

    @Test
    void deveNotificarInscritosQuandoOcorrerUmMatch() {
        Acao bb = new Acao(new Nome("BBAS3"), new Preco("23.00"));
        FakeInvestidor investidorTeste = new FakeInvestidor();
        bb.inscrever(investidorTeste);
        
        Preco valorNegocio = new Preco("24.00");
        bb.lancarOrdem(new Ordem(new Nome("Vendedor"), TipoOrdem.VENDA, valorNegocio));
        assertFalse(investidorTeste.foiNotificado);
        
        bb.lancarOrdem(new Ordem(new Nome("Comprador"), TipoOrdem.COMPRA, valorNegocio));
        assertTrue(investidorTeste.foiNotificado);
    }

    @Test
    void deveCadastrarEBuscarAcaoComSucesso() {
        BolsaDeValores bolsa = new BolsaDeValores();
        bolsa.cadastrarAcao(new Acao(new Nome("PETR4"), new Preco("30.00")));
        
        assertTrue(bolsa.buscarAcao(new Nome("PETR4")).isPresent());
        assertTrue(bolsa.escolherAcao(0).isPresent());
        assertFalse(bolsa.escolherAcao(99).isPresent());
    }

    @Test
    void deveCadastrarEBuscarInvestidorComSucesso() {
        BolsaDeValores bolsa = new BolsaDeValores();
        bolsa.cadastrarInvestidor(new Investidor(new Nome("Carlos")));
        
        assertTrue(bolsa.buscarInvestidor(new Nome("Carlos")).isPresent());
        assertTrue(bolsa.escolherInvestidor(0).isPresent());
    }

    private Scanner simularTeclado(String inputs) {
        return new Scanner(new ByteArrayInputStream(inputs.getBytes()));
    }

    @Test
    void statusAppDeveDesligarCorretamente() {
        StatusApp status = new StatusApp();
        assertTrue(status.isAtivo());
        
        ComandoSair comandoSair = new ComandoSair(status);
        comandoSair.executar();
        assertFalse(status.isAtivo());
    }

    @Test
    void comandoInvalidoNaoDeveQuebrarOSistema() {
        ComandoInvalido comando = new ComandoInvalido();
        assertDoesNotThrow(() -> comando.executar());
    }

    @Test
    void comandoCadastrarAcaoDeveCriarAcaoNoBanco() {
        BolsaDeValores bolsa = new BolsaDeValores();
        Scanner tecladoFake = simularTeclado("MGLU3\n10.50\n"); 
        
        ComandoCadastrarAcao comando = new ComandoCadastrarAcao(tecladoFake, bolsa);
        comando.executar();
        
        assertTrue(bolsa.buscarAcao(new Nome("MGLU3")).isPresent());
    }

    @Test
    void comandoCadastrarInvestidorDeveCriarInvestidorNoBanco() {
        BolsaDeValores bolsa = new BolsaDeValores();
        Scanner tecladoFake = simularTeclado("Silvio Santos\n"); 
        
        ComandoCadastrarInvestidor comando = new ComandoCadastrarInvestidor(tecladoFake, bolsa);
        comando.executar();
        
        assertTrue(bolsa.buscarInvestidor(new Nome("Silvio Santos")).isPresent());
    }

    @Test
    void seletorDeveRetornarVazioSeUsuarioDigitarLetraEmVezDeNumero() {
        BolsaDeValores bolsa = new BolsaDeValores();
        Scanner tecladoFake = simularTeclado("A\n");
        Seletor seletor = new Seletor(tecladoFake, bolsa);
        
        Optional<Acao> resultado = seletor.acao();
        assertFalse(resultado.isPresent());
    }

    @Test
    void comandoLancarOrdemDeveProcessarDadosCorretamente() {
        BolsaDeValores bolsa = new BolsaDeValores();
        bolsa.cadastrarAcao(new Acao(new Nome("VALE3"), new Preco("60.00")));
        bolsa.cadastrarInvestidor(new Investidor(new Nome("Barsi")));
        
        Scanner tecladoFake = simularTeclado("0\n0\nC\n55.00\n");
        Seletor seletor = new Seletor(tecladoFake, bolsa);
        
        ComandoLancarOrdem comando = new ComandoLancarOrdem(tecladoFake, seletor);
        assertDoesNotThrow(() -> comando.executar());
    }

    @Test
    void comandoProgramarGatilhoDeveFuncionarSemQuebrar() {
        BolsaDeValores bolsa = new BolsaDeValores();
        bolsa.cadastrarAcao(new Acao(new Nome("WEGE3"), new Preco("40.00")));
        bolsa.cadastrarInvestidor(new Investidor(new Nome("Faria Limer")));
        
        Scanner tecladoFake = simularTeclado("0\n0\n35.00\nC\n34.00\n");
        Seletor seletor = new Seletor(tecladoFake, bolsa);
        
        ComandoProgramarGatilho comando = new ComandoProgramarGatilho(tecladoFake, seletor);
        assertDoesNotThrow(() -> comando.executar());
    }
}