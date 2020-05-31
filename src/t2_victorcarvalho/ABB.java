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
public class ABB {

    private No raiz;

    //Cria uma árvore vazia
    public ABB() {
        this.raiz = null;
    }

    //Insere um elemento na árvore
    public void insere(String elemento) {
        No pai = null;
        No p = raiz;
        int cont = 1; //declara contador
        No novo = new No(elemento, cont, null, null);

        //Busca onde inserir o novo No
        while (p != null) {
            pai = p;

            //compara, ignorando case, a palavra que
            //já está na árvore e retorna um valor referente a ordem ascii
            //se a palavra vier antes, retorna um número positivo
            //se a palavra vier depois, retorna um número negativo
            //se a palavra for igual, retorna 0
            int valor = p.getElemento().compareToIgnoreCase(elemento);

            if (valor > 0) {
                p = p.getEsq();
            } else if (valor < 0) {
                p = p.getDir();
            } else {
                break;
            }
        }
        //Verificar árvore vazia
        if (pai == null) {
            raiz = novo;
            return;
        }

        int valor2 = pai.getElemento().compareToIgnoreCase(elemento);

        if (valor2 > 0) {
            pai.setEsq(novo);
        } else if (valor2 < 0) {
            pai.setDir(novo);
        } else {
            pai.setContador(pai.getContador() + cont);
        }
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    public void preOrdem(No p) {
        if (p != null) {
            System.out.print(p.getElemento() + "(" + p.getContador() + ") ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
    }

    public void inOrdem(No p) {
        if (p != null) {
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + "(" + p.getContador() + ") ");
            inOrdem(p.getDir());
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    public void posOrdem(No p) {
        if (p != null) {
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + "(" + p.getContador() + ") ");
        }
    }

    @Override
    public String toString() {
        return "ABB{" + "raiz=" + raiz + '}';
    }
}
