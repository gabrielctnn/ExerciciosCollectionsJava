package Ex_Streams;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        /* 
        A equipe do show te deu uma lista bruta com vários nomes de convidados. Eles precisam que você faça uma limpeza rápida nessa lista para resolver dois problemas:
        Filtrar os penetras: Remover qualquer nome que comece com a letra "X" (por algum motivo, a segurança disse que são nomes falsos).
        Organizar a fila: Colocar os nomes restantes em ordem alfabética.
        Gerar a lista final: Salvar o resultado em uma nova lista e exibir na tela.
        */
        List<String> convidados = List.of("Gabriel", "Xuxa", "Julya", "Xavinho", "Abigail"); //cira a lista de nomes
        List<String> convidadosSemX = convidados.stream() //cria uma nova lista fazia e pega o stream dela para fazer a  manipulação de dados 
            .filter(convidado -> !convidado.startsWith("X")) // verifica cada item da lista que começa com X e pega somente os que nao tem
            .sorted() // coloca os elementos em ordem
            .toList(); // imprime
        System.out.println(convidadosSemX);
    }
}