/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.aplicacao.view;

import java.io.PrintStream;       
import java.nio.charset.StandardCharsets; 
import java.util.Scanner;   

import java.util.ArrayList;
import java.util.List;

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
        control servico = new control();
        
        while(true){
                System.out.println("\n==== GERENCIADOR DE TAREFAS =====");
                System.out.println("1. Criar Tarefa");
                System.out.println("2. Listar Tarefas");
                System.out.println("3. Atualizar Tarefa");
                System.out.println("4. Remover Tarefa");
                System.out.println("5. Sair");
                System.out.print("\nEscolha uma opção:");
                
                
                int opcao = entrada.nextInt();
                entrada.nextLine(); 
                
                switch(opcao){
                    case 1 -> {
                        System.out.print("\nTitulo: ");
                        String titulo = entrada.nextLine();
                        
                        System.out.print("Descricao: ");
                        String descricao = entrada.nextLine();
                        
                        Tarefas nova = servico.criarTarefas(titulo, descricao);
                        System.out.println("\nTarefa Criada: " + nova.getTitulo());
                    }
                    case 2 ->{
                        List<Tarefas> tarefas = servico.listarTarefas();
                        
                        if(tarefas.isEmpty()){
                            System.out.println("\nNenhuma tarefa cadastrada.");
                        } else {
                            System.out.println("\nLista de Tarefas: ");
                            for(Tarefas t: tarefas){
                                System.out.println("\nID: " + t.getId());
                                System.out.println(" Titulo: " + t.getTitulo());
                                System.out.println(" Descrição: " + t.getDescricao());
                                System.out.println(" Data de criação: " + t.getDataHora());
                                System.out.println(" Completa: " +t.isCompleta());
                            }
                        }
                    }
                    case 3 ->{
                        System.out.print("\nID da tarefa para atualizar: ");
                        Long id = entrada.nextLong();
                        entrada.nextLine();
                        
                        System.out.print("Novo título (deixe vazio para manter o mesmo): ");
                        String novoTitulo = entrada.nextLine();
                        
                        System.out.print("Nova descrição (deixe vazio para manter o mesmo): ");
                        String novaDescricao = entrada.nextLine();
                        
                        System.out.print("Mudar status? (s = COMPLETA, n = NÃO COMPLETA | Aperte enter para manter o mesmo): ");
                        String s = entrada.nextLine().trim().toLowerCase();
                        
                        Boolean completa = null;
                        
                        if(s.equals("s")) completa = true;
                        else if (s.equals("n")) completa = false;
                        
                        Tarefas atualizada = servico.atualizarTarefas(id, novoTitulo, novaDescricao, completa);
                        if (atualizada != null) {
                            System.out.println("Tarefa atualizada com sucesso!");
                        } else {
                            System.out.println("Tarefa não encontrada.");
                        }
                    }
                }
        }     
    }
}
