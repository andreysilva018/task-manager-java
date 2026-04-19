/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Tarefas;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class TarefaRepository {
    private Connection conn;
    
    public TarefaRepository(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public void CadastrarTarefa(Tarefas tarefa) throws Exception{
        String sql = "INSERT INTO tb_tarefas(TITULO, DESCRICAO, STATUS, ATIVO)"
                    + "values(?, ?, ?, ?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, tarefa.getTitulo());
        stmt.setString(2, tarefa.getDescricao());
        stmt.setString(3, tarefa.getStatus());
        stmt.setBoolean(4, tarefa.isAtivo());
        
        stmt.execute();
        stmt.close();
    }
}
