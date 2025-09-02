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
    private LocalDateTime dataHora;
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

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataHora
     */
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the completa
     */
    public boolean isCompleta() {
        return completa;
    }

    /**
     * @param completa the completa to set
     */
    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}
