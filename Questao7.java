/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner scaneer = new Scanner(System.in);
        FileWriter arq = new FileWriter("C:\\Users\\aluno\\Documents\\quarta.txt");
        PrintWriter l = new PrintWriter(arq);
        
        System.out.println("Escreva numero ");
        l.printf("Escreva numero");
        int numero = scaneer.nextInt();
        
        System.out.println("Multiplicar por ");
        l.printf("Multiplicar por ");
        int n = scaneer.nextInt();
        
        int r = (numero * n);
        System.out.printf("Resultado = " + r);
    } 
}
