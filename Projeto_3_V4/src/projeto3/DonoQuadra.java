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
public class DonoQuadra {

    private String nome;
    private List<Quadra> quadras;
    private List<Aluguel> alugueis;

    public DonoQuadra() {
        quadras = new ArrayList<>();
        alugueis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Quadra> getQuadras() {
        return quadras;
    }

    public void setQuadras(List<Quadra> quadras) {
        this.quadras = quadras;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public void addQuadra(Quadra quadra) {
        this.quadras.add(quadra);
    }

    public void addAluguel(Aluguel aluguel) {
        this.alugueis.add(aluguel);
    }

}
