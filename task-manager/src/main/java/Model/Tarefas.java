/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Windows
 */
public class Tarefas {
    private int id;
    private String titulo;
    private String descricao;
    private StatusTarefa status;
    private boolean ativo;

    public enum StatusTarefa{
        PENDENTE,
        EM_ANDAMENTO,
        CONCLUIDA
    }
    
    public Tarefas(String titulo, String descricao, StatusTarefa status, boolean ativo){
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.ativo = ativo;
    }
    
    public Tarefas(String titulo, String descricao, int id){
        this.titulo = titulo;
        this.descricao = descricao;
        this.id = id;
    }
        
    public Tarefas(int id, StatusTarefa status){
        this.id = id;
        this.status = status;
    }
    
    public Tarefas(int id, boolean ativo){
        this.id = id;
        this.ativo = ativo;
    }
    
    public Tarefas() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public StatusTarefa getStatus() {
        return status;
    }
    public void setStatus(StatusTarefa status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return titulo;
    }
    
}
