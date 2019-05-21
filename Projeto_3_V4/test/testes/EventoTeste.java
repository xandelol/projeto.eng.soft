package testes;

/*
 * 130854 Giuliano Cesari Tacioli
 * 120223 Alexandre Antonelli Cardoso
 * 122268 Esdras da Costa Silva
 * 171917 Lucas Mello Namorato
 * 153186 Glauber Augusto de Freitas Cruz
 */
import java.util.ArrayList;
import projeto3.Evento;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import projeto3.Jogo;
import projeto3.Organizador;

public class EventoTeste {

    private Organizador organizador;
    private Jogo jogo;
    float valor;

    @Before
    public void criaTesters() {
        this.organizador = new Organizador("Tester");
        this.jogo = new Jogo("jogo de teste");
        this.valor = 10f;
    }

    @Test
    public void eventoPossuiOrganizador() {
        Evento evento = new Evento(organizador, valor, jogo);
        assertNotNull(evento.getOrganizador());
    }

    @Test
    public void eventoPossuiJogo() {
        Evento evento = new Evento(organizador, valor, jogo);
        assertNotNull(evento.getJogo());
    }

    @Test
    public void eventoPossuiValorValido() {
        valor = -10f;
        Evento evento = new Evento(organizador, valor, jogo);

        boolean valor_nao_negativo = evento.getValorDeEntrada() >= 0;
        
        // corrigido e refatorado na classe Evento
        assertEquals(true, valor_nao_negativo);
    }

    @Test
    public void organizadorPossuiEvento() {
        Evento evento = new Evento(organizador, valor, jogo);
        
        // corrigido e refatorado nas classes Evento e Organizador
        assertEquals(true, organizador.getEventos().contains(evento));
    }

}
