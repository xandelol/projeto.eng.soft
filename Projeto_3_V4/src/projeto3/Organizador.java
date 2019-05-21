/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto3;

import java.util.ArrayList;
import java.util.List;

/*
 * 130854 Giuliano Cesari Tacioli
 * 120223 Alexandre Antonelli Cardoso
 * 122268 Esdras da Costa Silva
 * 171917 Lucas Mello Namorato
 * 153186 Glauber Augusto de Freitas Cruz
 */
public class Organizador {

    private String nome;
    private List<Evento> eventos;
    private List<Quadra> quadrasFavoritas;
    private List<Aluguel> alugueis;

    private float notaAvaliacao;

    public Organizador() {
    }

    public Organizador(String nome) {
        this.nome = nome;
        this.eventos = new ArrayList<>();
        this.quadrasFavoritas = new ArrayList<>();
        this.alugueis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Quadra> getQuadrasFavoritas() {
        return quadrasFavoritas;
    }

    public void setQuadrasFavoritas(List<Quadra> quadrasFavoritas) {
        this.quadrasFavoritas = quadrasFavoritas;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public float getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(float notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public boolean addEvento(Evento evento) {
        return this.eventos.add(evento);
    }

}
