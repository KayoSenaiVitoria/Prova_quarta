/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.io.DataInputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;

/**
 *
 * @author aluno
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        DataInputStream dado = new DataInputStream(System.in);
        
        String mes = "";
        
        System.out.println("Informe o numero do mês -> ");
        mes = dado.readLine();
        
        int d = parseInt(mes);
        
        if(d < 1){
            System.out.print("Invalido !");
            dado.close();
        } else if(d > 12){
            System.out.print("Invalido !");
            dado.close();
        }
        
        switch (d){
            case 1:
                System.out.println("Janeiro");
                break;
                
            case 2:
                System.out.println("Fevereiro");
                break;
                
            case 3:
                System.out.println("Março");
                break;
                
            case 4:
                System.out.println("Abril");
                break;
                
            case 5:
                System.out.println("Maio");
                break;
                
            case 6:
                System.out.println("Junho");
                break;
                
            case 7:
                System.out.println("Julho");
                break;
                
            case 8:
                System.out.println("Agosto");
                break;
                
            case 9:
                System.out.println("Setembro");
                break;
                
            case 10:
                System.out.println("Outubro");
                break;
                
            case 11:
                System.out.println("Novembro");
                break;
                
            case 12:
                System.out.println("Dezembro");
                break;   
        }
    }
}
