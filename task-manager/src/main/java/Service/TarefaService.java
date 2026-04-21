/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Tarefas;
import Repository.TarefaRepository;
import java.util.List;

/**
 *
 * @author Windows
 */
public class TarefaService {
    TarefaRepository repository = new TarefaRepository();
    
    public void CadastrarTarefa(String titulo, String descricao) throws Exception{
        String status = "Pendente";
        boolean ativo = true;
        
        Tarefas tarefa = new Tarefas(titulo, descricao, status, ativo);
        repository.CadastrarTarefa(tarefa);
    }
    
    public List<Tarefas> listarTarefas() throws Exception{
        return repository.listarTarefas();
    }
    
}
