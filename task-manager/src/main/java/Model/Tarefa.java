/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Windows
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean status;

    public Tarefa(String titulo,string descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean setStatus(){
        this.status = true;
    }
    public boolean getStatus(){
        return status;
    }
    

}
