/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto3;

import java.util.ArrayList;

/*
 * 130854 Giuliano Cesari Tacioli
 * 120223 Alexandre Antonelli Cardoso
 * 122268 Esdras da Costa Silva
 * 171917 Lucas Mello Namorato
 * 153186 Glauber Augusto de Freitas Cruz
 */
public class Evento {

    private Organizador organizador;
    private float valorDeEntrada;
    private String data;
    private Jogo jogo;

    public Evento() {
    }

    public Evento(Organizador organizador, float valor, Jogo jogo) {
        organizador.addEvento(this);
        if (valor < 0) {
            valor = 0;
        }

        this.organizador = organizador;
        this.valorDeEntrada = valor;
        this.jogo = jogo;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public float getValorDeEntrada() {
        return valorDeEntrada;
    }

    public void setValorDeEntrada(float valorDeEntrada) {
        this.valorDeEntrada = valorDeEntrada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

}
