/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_extra;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;

/**
 *
 * @author aluno
 */
public class Questao_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DataInputStream dado = new DataInputStream(System.in);
        
        String nome = "";
        String peso = "";
        
        System.out.println("Nome do lutador -> ");
        nome = dado.readLine();
        
        System.out.println("Peso do lutador -> ");
        peso = dado.readLine();
        
        int s = parseInt(peso);
        
        System.out.print("O lutador " + nome + " pesa " + s + "kg e se enquadra na categoria ");
        if(s < 65){
            System.out.print("Pena");  
        }
        if(s >= 65 && s < 72){
            System.out.print("Leve");  
        }
        if(s >= 72 && s < 79){
            System.out.print("Ligeiro");  
        }
        if(s >= 79 && s < 86){
            System.out.print("Meio médio");  
        }
        if(s >= 86 && s < 93){
            System.out.print("Médio");  
        }
        if(s >= 93 && s < 100){
            System.out.print("Meio pesado");  
        }
        if(s >= 100){
            System.out.print("Pesado");  
        }
    }
}
