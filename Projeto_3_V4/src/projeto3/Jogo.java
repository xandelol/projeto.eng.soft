/*
 * 130854 Giuliano Cesari Tacioli
 * 120223 Alexandre Antonelli Cardoso
 * 122268 Esdras da Costa Silva
 * 171917 Lucas Mello Namorato
 * 153186 Glauber Augusto de Freitas Cruz
 */
package projeto3;

import java.util.ArrayList;

public class Jogo {

    private String descricao;
    private ArrayList<Jogador> jogadores;
    public boolean timeCompleto = false;

    private Quadra quadra;

    public Jogo() {
    }

    public Jogo(String descricao) {
        this.descricao = descricao;
        this.jogadores = new ArrayList<Jogador>();
        this.quadra = null;
    }

    public Jogo(String descricao, Quadra quadra) {
        this(descricao);
        this.quadra = quadra;
    }

    public void adicionaJogador(String nomeJogador) {

        if (!timeCompleto) {
            jogadores.add(new Jogador(nomeJogador));

            if (getNumeroJogadores() == 5) {
                timeCompleto = true;
            }
        }
    }

    public int getNumeroJogadores() {
        return jogadores.size();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public boolean isTimeCompleto() {
        return timeCompleto;
    }

    public void setTimeCompleto(boolean timeCompleto) {
        this.timeCompleto = timeCompleto;
    }
    
    
    

}
