/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

import java.io.DataInputStream;
import java.io.IOException;
import static java.lang.Double.parseDouble;

/**
 *
 * @author aluno
 */
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DataInputStream dado = new DataInputStream(System.in);
        
        double hora = 88;
        String trabalhou = "";
        
        System.out.println("Informe horas trabalhadas -> ");
        trabalhou = dado.readLine();
        
        double hst = parseDouble(trabalhou);
        
        double salario_bruto = (hst * hora);
        double renda = (salario_bruto / 110);
        double inss = (salario_bruto / 80);
        double sindicato = (salario_bruto / 50);
        
        double salario_liquido = (salario_bruto - renda - inss - sindicato);
        System.out.println("Salario bruto R$ " + salario_bruto + " reais.");
        System.out.println("Salario liquido de R$ " + salario_liquido + " reais.");
    }
}
