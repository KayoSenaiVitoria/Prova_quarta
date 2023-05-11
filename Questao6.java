/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DataInputStream dado = new DataInputStream(System.in);
        
        String nome = "";
        String filme = "";
        String pista1 = "";
        String pista2 = "";
        
        String jogador2 = "";
        String nome_filme = "";
        
        System.out.println("Escreva seu nome ");
        nome = dado.readLine();
        
        System.out.println("Escreva o nome do filme ");
        filme = dado.readLine();
        
        System.out.println("Escreva 1° pista ");
        pista1 = dado.readLine();
        
        System.out.println("Escreva 2° pista ");
        pista2 = dado.readLine();
        
        System.out.println("Escreva o nome do jogador ");
        jogador2 = dado.readLine();
        
        System.out.println("Escreva o nome do filme ");
        nome_filme = dado.readLine();
        
        if(nome_filme == filme){
            System.out.println("Resposta correta");
        }
    }
}
