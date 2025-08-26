/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.aplicacao.model;

import java.time.LocalDateTime;
/**
 *
 * @author kenay
 */
public class Tarefas {
    
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime horario;
    private boolean completa;
    
    //Construtor padrao
    
    public Tarefas(){
        this.horario = LocalDateTime.now();
        this.completa = false;
    }
    
    //Construtor com titulo
    
    public Tarefas(String titulo){
        this();
        this.titulo = titulo;
    }
    
    //Construtor com titulo e descricao
    
    public Tarefas(String titulo, String descricao){
        this(titulo);
        this.descricao = descricao;
    
    }
    
    //Construtor Completo
    
    public Tarefas(Long id, String titulo, String descricao, boolean completa){
        this(titulo, descricao);
        this.id = id;
        this.completa = completa;
    }
}
