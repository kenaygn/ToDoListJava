/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.aplicacao.control;

import ucb.aplicacao.model.Tarefas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenay and manoel
 */
public class control {
    private List <Tarefas> tarefas = new ArrayList();
    private Long contadorId = 1L;
    
    //Criar Tarefa
    public Tarefas criarTarefas(String titulo, String descricao){
        
        //Metodos construtores
        Tarefas tarefa = new Tarefas(contadorId++, titulo, descricao, false);
        tarefas.add(tarefa);
        return tarefa;
    }
    
    //Listar todas tarefas
    
    
    
    
}
