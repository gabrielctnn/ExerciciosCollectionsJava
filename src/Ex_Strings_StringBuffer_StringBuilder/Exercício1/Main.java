package Ex_Strings_StringBuffer_StringBuilder.Exercício1;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        menu();
    }
    
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("--------------- CALCULADORA--------------- ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("----------------");
            System.out.println("0 - Sair");
            
            escolha = scan.nextInt();
            
            switch(escolha){
                case 1 : Calculadora.Soma(); break;
                case 2 : Calculadora.Subtracao(); break;
                case 0 : System.out.println("Fechando programa"); break;
                default: System.out.println("Número inválido! Tente novamente.");
            }
        } while (escolha != 0);
    }
}

