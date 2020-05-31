/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_victorcarvalho;

import java.nio.file.*;
import java.util.*;

/**
 *
 * @author victor lopes de carvalho
 */
public class FreqPalavra {

    public static void main(String[] args) {
        ABB arvore = new ABB(); //declara arvore

        String[] palavrasLinha; //lista das palavras da linha
        
        String texto = ""; //texto final
        System.out.println(texto); //só para não ficar aparecendo o popup

        try {

            List<String> leTexto = Files.readAllLines(Paths.get("texto.txt")); //lê o arquivo inteiro e coloca no List
            texto = String.join("\n", leTexto); //recebe o List inteiro como string

            System.out.println(texto); //printa o texto completo

            for (String linha : leTexto) { //anda linha por linha na List
                if (linha.equals("0")) {//condição de parada de leitura
                    break;
                }

                palavrasLinha = linha.split("\\W+"); //splita as palavras

                //NOTA: \\W+ inclue acentos e cedilha (ç), não usar no texto, obrigado 
                
                for (String palavra : palavrasLinha) { //anda palavra por palavra na linha
                    if (palavra.equals("")) { //split \\W+ não identifica "" (no caso, paragrafo) como caracter especial
                    } else {
                        arvore.insere(palavra); //insere a palavra na arvore
                    }
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        
        //printa arvore em pré-ordem
        System.out.print("pré-ordem: ");
        arvore.preOrdem();
        System.out.println();

        //printa arvore em in-ordem
        System.out.print("in-ordem: ");
        arvore.inOrdem();
        System.out.println();

        //printa arvore em pós-ordem
        System.out.print("pós-ordem: ");
        arvore.posOrdem();
        System.out.println();
    }
}
