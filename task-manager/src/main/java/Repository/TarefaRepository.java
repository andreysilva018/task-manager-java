/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Tarefas;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
        stmt.setString(3, tarefa.getStatus().toString().toUpperCase());
        stmt.setBoolean(4, tarefa.isAtivo());
        
        stmt.execute();
        stmt.close();
    }
    
    public void AtualizarTarefa(Tarefas tarefa) throws Exception{
        String sql = "UPDATE tb_tarefas(TITULO=?, DESCRICAO=?, STATUS=?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, tarefa.getTitulo());
        stmt.setString(2, tarefa.getDescricao());
        stmt.setString(3, tarefa.getStatus().name());
        stmt.setBoolean(4, tarefa.isAtivo());
        stmt.setInt(5, tarefa.getId());
        
        stmt.execute();
        stmt.close();
    }
    
    public void AlterarStatusTarefa(Tarefas tarefa) throws Exception{
        String sql = "UPDATE tb_tarefas SET status = ? WHERE id = ?";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, tarefa.getStatus().name());
        stmt.setInt(2, tarefa.getId());
        
        stmt.executeUpdate();
        stmt.close();
    }
    
    public List<Tarefas> listarTarefas() throws Exception{
        List<Tarefas> lista = new ArrayList<>();
        String sql = "Select * from tb_tarefas";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Tarefas tarefa = new Tarefas();
            tarefa.setId(rs.getInt("ID"));
            tarefa.setTitulo(rs.getString("TITULO"));
            tarefa.setDescricao(rs.getString("DESCRICAO"));
            System.out.println("Status do banco: [" + rs.getString("STATUS") + "]");
            tarefa.setStatus(Tarefas.StatusPedido.valueOf(rs.getString("STATUS")));
            tarefa.setAtivo(rs.getBoolean("ATIVO"));
            
            lista.add(tarefa);
        }
        rs.close();
        stmt.close();
        return lista;
    }
}
