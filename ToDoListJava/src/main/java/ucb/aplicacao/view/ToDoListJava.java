/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.aplicacao.view;

import java.io.PrintStream;       
import java.nio.charset.StandardCharsets; 
import java.util.Scanner;         
import ucb.aplicacao.control.control;
import ucb.aplicacao.model.Tarefas;

/**
 *
 * @author kenay and manoel
 */
public class ToDoListJava {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner entrada = new Scanner(System.in);
        control service = new control();
        
        while(true){
                System.out.println("\n==== GERENCIADOR DE TAREFAS =====");
                System.out.println("1. Criar Tarefa");
                System.out.println("2. Listar Tarefas");
                System.out.println("3. Atualizar Tarefa");
                System.out.println("4. Remover Tarefa");
                System.out.println("5. Sair");
                System.out.println("Escolha uma opção:");
                
                
                int opcao = entrada.nextInt();
                entrada.nextLine(); 
                
                switch(opcao){
                    case 1 -> {
                        System.out.println("Titulo: ");
                        String titulo = entrada.nextLine();
                        
                        System.out.println("Descricao: ");
                        String descricao = entrada.nextLine();
                        
                        Tarefas nova = service.criarTarefas(titulo, descricao);
                        System.out.println(" Tarefa Criada: " + nova.getTitulo());
                    }
                }
        }  
        
    }
}
