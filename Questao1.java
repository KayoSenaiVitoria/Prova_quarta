/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.io.DataInputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;


/**
 *
 * @author aluno
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DataInputStream dado = new DataInputStream(System.in);
        
        String ano = "";
        String mes = "";
        String dia = "";
        
        System.out.print("Informe ano -> ");
        ano = dado.readLine();
        
        System.out.print("Informe mês -> ");
        mes = dado.readLine();
        
        System.out.print("Informe dia -> ");
        dia = dado.readLine();
        
        int cvs_ano = parseInt(ano);
        int cvs_dias = (cvs_ano * 365);
        
        int cvs_mes = parseInt(mes);
        int cvs_dia_mes = (cvs_mes * 30);
        
        int cvs_dia = parseInt(dia);
        
        int soma = (cvs_dias + cvs_dia_mes + cvs_dia);
        
        System.out.print("Anos -> " + cvs_ano + "\nMês -> " + cvs_dia_mes + "\nDia -> " + cvs_dia + "\nTotal -> " + soma);
    }
}
