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
    public List<Tarefas> listarTarefas(){
        return tarefas;
    }
    
    //Atualizar tarefa
    
    public Tarefas atualizarTarefas(Long id, String novoTitulo, String novaDescricao, boolean completa){
        for(Tarefas tarefa: tarefas) {
            // O id da tarefa ser o mesmo que a pessoa coloca
            if (tarefa.getId().equals(id)) {
                if (novoTitulo != null && !novoTitulo.isEmpty()) {
                    tarefa.setTitulo(novoTitulo);
                }
                if (novaDescricao != null && !novaDescricao.isEmpty()) {
                    tarefa.setDescricao(novaDescricao);
                }
                tarefa.setCompleta(completa);
                return tarefa;
            }
        }
        return null;
    }
    
    //Remover tarefa
    
    public boolean removerTarefa(Long id){
        boolean removido = tarefas.removeIf(tarefa -> tarefa.getId().equals(id));
        return removido;
    }
    
    
    
}
