import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
       // ########## EXERCÍCIOS PRÁTICOS - ARRAY, LIST E SET
       
       /* Ex1 :  Antes do show começar, a equipe de segurança coloca uma barreira física com um limite máximo de 5 caixas de energético para os funcionários da portaria. 
       O que fazer: Crie um Array de tamanho fixo (5) para guardar o nome das marcas de energético disponíveis. Preencha os 5 espaços.*/
       
       System.out.println("Entrada permitida: até 5 Caixa de Energético. Por favor identifique os energético a seguir:");
       String[] marcasEnergetico = new String[5]; //cria o array limitando a no máximo 5 indices. (0, 1, 2, 3 e 4)
      
       for (int i = 0; i < marcasEnergetico.length; i ++){ //laço for para digitar o nome das marcas
           System.out.println("Digite a " + (i + 1) +  "° marca:");
           marcasEnergetico[i] = scan.nextLine();
       }
       
       System.out.println("Marcas Registradas:");
       for(String marca : marcasEnergetico){ //laço foreach para exibir o nome das marcas
           System.out.println(marca);
       }
       
       
       /* Ex2 : As pessoas vão chegando para o show e entram em uma fila ordenada por ordem de chegada. A fila não tem tamanho máximo, pois mais pessoas podem chegar a qualquer momento.
        O que fazer: Crie uma List chamada filaDeEntrada. Adicione 5 nomes nessa lista (ex: "Ana", "Bruno", "Carlos", "Ana" de novo porque comprou dois ingressos por engano, e "Diego"). */

        List<String> filaEntrada = new ArrayList<>();
        System.out.println("Digite o nome das pessoas na fila. (Digite 's' para finalizar)");
        
        // faz um laço para digitar os nomes enquanto nao digitar 's' para parar;
        String pessoa = scan.nextLine(); // verificação inicial 
        while (!pessoa.equalsIgnoreCase("s")) {  // Usar o != ele compararia o endereço na memoria, o equals compara o valor em si, e ignore Upper Case para ignorar maiusculo e minusculo
            filaEntrada.add(pessoa);
            pessoa = scan.nextLine();
        }
     
        // laço para exibir as pessoas na fila.
        System.out.println("Na fila:");
        for (String pessoas : filaEntrada){
            System.out.println(pessoas);
        }


        /* Ex3 : Cada pessoa que passa pela portaria ganha uma pulseira com o seu nome e entra no show. O sistema não pode permitir que o mesmo nome ganhe duas pulseiras (duplicidade de ingresso).
        O que fazer: Crie um HashSet chamado pessoasNoShow.
        */
        
        Set<String> pessoasNoShow = new HashSet<>();
        
        for(String pessoas : filaEntrada){
            if (pessoasNoShow.add(pessoas)){
                System.out.println("Sucesso! "+ pessoas + " entrou no show.");
            } else {
                System.out.println("Negado! "+ pessoas + " já entrou no show.");
            }
        }
        
        
        


    }
}

