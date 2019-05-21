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
public class Aluguel {

    private DonoQuadra dono;
    private Organizador organizador;
    private float valorAluguel;
    private String dataPrazo;

    public Aluguel() {
    }

    public Aluguel(DonoQuadra dono, Organizador organizador, float valorAluguel, String dataPrazo) {
        this.dono = dono;
        this.organizador = organizador;
        this.valorAluguel = valorAluguel;
        this.dataPrazo = dataPrazo;
    }

    public DonoQuadra getDono() {
        return dono;
    }

    public void setDono(DonoQuadra dono) {
        this.dono = dono;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(String dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

}
