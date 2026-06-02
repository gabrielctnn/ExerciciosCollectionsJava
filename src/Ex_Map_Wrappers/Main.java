import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
       // ########## EXERCÍCIOS PRÁTICOS - Map e Wrappers
       
       /* Ex: Cadastro de Ingressos por CPF
        O que fazer: 
        1. Crie um Map chamado cadastroShow onde a Chave é o CPF (String) e o Valor é a idade (Wrapper correto!).
        2. Adicione 3 pessoas usando o método .put(chave, valor) com CPFs e idades diferentes.
        3. Busque a idade do CPF "123.456.789-00" usando o método .get(chave).
        4. Faça um 'if' para validar: se a idade for maior ou igual a 18, "Entrada Liberada". Se não, "Entrada Proibida".
        */
        
        // Criação do Map (TipoChave, TipoValor)
        Map<String, Integer> cadastroShow = new HashMap<>();
        
       // Lê o primeiro CPF antes de entrar no laço
        System.out.println("Digite seu CPF: (Exemplo: 000.000.000.00)");
        String cpf = scan.nextLine();
        
        // O while testa ANTES de rodar. Se o CPF for vazio, ele nem entra
        while (!cpf.isEmpty()) {
            System.out.println("Digite sua Idade: ");
            int idade = scan.nextInt();
            scan.nextLine(); 
        
            // Salva no Map
            cadastroShow.put(cpf, idade);
            System.out.println("Cadastrado com sucesso!\n");
            
            //  Lê o próximo CPF
            System.out.println("Digite seu CPF: (Ou aperte ENTER para finalizar)");
            cpf = scan.nextLine();
        }
        
        System.out.println("Validando entrada por CPF");
        String cpfBuscado = "456.123.987.00";
        
       // containskey busca se contem a chave 
    
        if(cadastroShow.containsKey(cpfBuscado)){
             int idadeDoUsuario  = cadastroShow.get(cpfBuscado);
              if(idadeDoUsuario >= 18){
            System.out.println("Entrada Liberada!");
            } else {
                System.out.println("Entrada Bloqueada, usuário menor de idade!");
            }
        } else {
            System.out.println("CPF não encontrado no sistema.");
        }

    }
}

