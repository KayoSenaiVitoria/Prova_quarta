/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.io.DataInputStream;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataInputStream dado = new DataInputStream(System.in);
        
        String num1 = JOptionPane.showInputDialog(null, "Informe o 1° numero");
        String num2 = JOptionPane.showInputDialog(null, "Informe o 2° numero");
        
        int cv1 = parseInt(num1);
        int cv2 = parseInt(num2);
        
        if(cv1 < cv2){
            for(int i = cv1; i < cv2; i++){
                System.out.println("Numero " + i);
            } 
        }else if(cv2 > cv1){
            for(int q = cv1; q > cv2; ++q){
                System.out.println("Numero " + q);
            }
        }
    }
}
