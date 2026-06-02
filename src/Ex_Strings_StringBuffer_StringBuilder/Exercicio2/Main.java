package Ex_Strings_StringBuffer_StringBuilder.Exercicio2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de contato!");
        String entrada = scan.nextLine();
        List<String> numero = new ArrayList<>();
        switch (entrada.length()){
            case 8: 
                String formatado = entrada.substring(0,4) + "-" + entrada.substring(4); // pega os valores entre o indice 0 e 4, dps adicioan o "-" e depois pega apartir do indice 4
                System.out.println("Telefone Fixo: " + formatado);break; //xxxx-xxxx
             case 9:
                  formatado = entrada.substring(0,5) + "-" + entrada.substring(5);
                System.out.println("Celular: " + formatado) ;break ;//xxxxx-xxxx
            case 10: 
                 formatado = "(" + entrada.substring(0,2) + ")" + entrada.substring(2,7) + "-" + entrada.substring(7);
                System.out.println("Telefone FIxo: " + formatado) ;break;//(xx)xxxx-xxxx
            case 11:
                 formatado = "(" + entrada.substring(0,2) + ")" + entrada.substring(2,8) + "-" + entrada.substring(8);
                System.out.println("Celular: " + formatado) ;return;//(xx)xxxxx-xxxx
           default: System.out.println("Número inválido!");
        }
    }
    
}
