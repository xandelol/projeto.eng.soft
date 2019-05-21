package testes;

/*
 * 130854 Giuliano Cesari Tacioli
 * 120223 Alexandre Antonelli Cardoso
 * 122268 Esdras da Costa Silva
 * 171917 Lucas Mello Namorato
 * 153186 Glauber Augusto de Freitas Cruz
 */
import projeto3.Jogo;
import projeto3.Quadra;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.*;


public class JogoTeste {
   

    @Test
    public void jogoAconteceCom5Jogadores() {
        Jogo jogo = new Jogo("Jogo de Basquete");
        jogo.adicionaJogador("A");
        jogo.adicionaJogador("B");
        jogo.adicionaJogador("C");
        jogo.adicionaJogador("D");
        jogo.adicionaJogador("E");

        assertEquals(true, jogo.isTimeCompleto());
        assertEquals(5, jogo.getNumeroJogadores());
    }

    @Test
    public void jogoAconteceEmUmaQuadra() {
        Quadra quadra = new Quadra();
        Jogo jogo = new Jogo("basquete", quadra);
        assertNotNull(jogo.getQuadra());
    }
    
    @Test
    public void jogoAconteceCom5JogadoresMock() {
    	
    	Jogo jogoFalso = mock(Jogo.class);
    	
    	jogoFalso.adicionaJogador("A");
    	jogoFalso.adicionaJogador("B");
    	jogoFalso.adicionaJogador("C");
    	jogoFalso.adicionaJogador("D");
    	jogoFalso.adicionaJogador("E");
    	
    	when(jogoFalso.getNumeroJogadores()).thenReturn(5);
    	
    	if(jogoFalso.getNumeroJogadores() == 5) {
    		jogoFalso.setTimeCompleto(true);
    	}
    	    	
    	when(jogoFalso.isTimeCompleto()).thenReturn(true);
    	
    	verify(jogoFalso, times(1)).adicionaJogador("A");
    	verify(jogoFalso, times(1)).adicionaJogador("B");
    	verify(jogoFalso, times(1)).adicionaJogador("C");
    	verify(jogoFalso, times(1)).adicionaJogador("D");
    	verify(jogoFalso, times(1)).adicionaJogador("E");
    	
    	verify(jogoFalso, times(1)).getNumeroJogadores();
    	
        assertEquals(5, jogoFalso.getNumeroJogadores());
        assertEquals(true, jogoFalso.isTimeCompleto());
        
    }
    
    
}
