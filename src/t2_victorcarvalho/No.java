/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_victorcarvalho;

/**
 *
 * @author victor lopes de carvalho
 */
public class No {

    private String elemento;
    private int contador;
    private No esq;
    private No dir;

    public No(String elemento, int contador, No esq, No dir) {
        this.elemento = elemento;
        this.contador = contador;
        this.esq = esq;
        this.dir = dir;
    }

    public String getElemento() {
        return elemento;
    }

    public No getEsq() {
        return esq;
    }

    public No getDir() {
        return dir;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", contador=" + contador + ", esq=" + esq + ", dir=" + dir + '}';
    }


}
