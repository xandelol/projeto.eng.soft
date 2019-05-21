/*
 * 130854 Giuliano Cesari Tacioli
 * 120223 Alexandre Antonelli Cardoso
 * 122268 Esdras da Costa Silva
 * 171917 Lucas Mello Namorato
 * 153186 Glauber Augusto de Freitas Cruz
 */
package projeto3;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private String Nome;

    private List<Quadra> quadrasFavoritas;

    public Jogador() {
    }

    public Jogador(String nome) {
        this.Nome = nome;
        this.quadrasFavoritas = new ArrayList<>();

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<Quadra> getQuadrasFavoritas() {
        return quadrasFavoritas;
    }

    public void setQuadrasFavoritas(List<Quadra> quadrasFavoritas) {
        this.quadrasFavoritas = quadrasFavoritas;
    }

}
