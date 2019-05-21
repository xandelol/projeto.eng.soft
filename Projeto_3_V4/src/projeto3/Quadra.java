/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto3;

/*
 * 130854 Giuliano Cesari Tacioli
 * 120223 Alexandre Antonelli Cardoso
 * 122268 Esdras da Costa Silva
 * 171917 Lucas Mello Namorato
 * 153186 Glauber Augusto de Freitas Cruz
 */
public class Quadra {

    private String nome;

    private String local;

    public Quadra() {
    }

    public Quadra(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}
