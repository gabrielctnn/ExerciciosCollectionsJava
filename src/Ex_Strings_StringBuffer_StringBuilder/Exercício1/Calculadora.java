package Ex_Strings_StringBuffer_StringBuilder.Exercício1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculadora {
    public static void Soma() {
        Scanner scan = new Scanner(System.in);
        List<Double> numerosCalculo = new ArrayList<>();

        System.out.println("Digite números para somar, separados por vírgula. (Digite 'ok' para não adicionar mais números)");
        //variavel que guarda os numeros -> string = 10,20,30,40..
        String entrada = scan.next();
        // o split corta na virgula e cria o array de textos string[] = [10], [20], [30], [40]....
        String[] numerosEmTexto = entrada.split(",");

        for (String texto : numerosEmTexto) {
            numerosCalculo.add(Double.parseDouble(texto.trim()));
        }
        double resultadoSoma = 0;
        // passa por cada indice na lista ate bater no ultimo e vai somando
        for (int i = 0; i < numerosCalculo.size(); i++) {
            resultadoSoma += numerosCalculo.get(i);
        }
        System.out.println("---------------------------------");
        System.out.println("O resultado da soma é: " + resultadoSoma);
        System.out.println("---------------------------------");
    }

    public static void Subtracao() {
        Scanner scan = new Scanner(System.in);
        List<Double> numerosCalculo = new ArrayList<>();
        System.out.println("Digite números para subtrair, separados  por vírgula. (Digite 'ok' para não adicionar mais números)");
        //variavel que guarda os numeros -> string = 10,20,30,40..
        String entrada = scan.next();
        // o split corta na virgula e cria o array de textos string[] = [10], [20], [30], [40]....
        String[] numerosEmTexto = entrada.split(",");

        for (String texto : numerosEmTexto) {
            numerosCalculo.add(Double.parseDouble(texto.trim()));
        }
        double resultadoSubtracao = numerosCalculo.get(0);
        for (int i = 1; i < numerosCalculo.size(); i++) {
            resultadoSubtracao -= numerosCalculo.get(i);
        }
        System.out.println("---------------------------------");
        System.out.println("O resultado da subtracao é: " + resultadoSubtracao);
        System.out.println("---------------------------------");
    }
}
