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
    private string titulo;
    private string descricao;
    private boolean status;

    public Tarefa(string titulo,string descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = false;
    }

    public string getTitulo(){
        return titulo;
    }

    public string getDescricao(){
        return descricao;
    }

    public boolean setStatus(){
        this.status = true;
    }
    public boolean getStatus(){
        return status;
    }
    

}
