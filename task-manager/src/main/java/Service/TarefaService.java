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
        Tarefas.StatusTarefa status = Tarefas.StatusTarefa.PENDENTE;
        boolean ativo = true;
        
        Tarefas tarefa = new Tarefas(titulo, descricao, status, ativo);
        repository.CadastrarTarefa(tarefa);
    }
    
    public void AtualizarTarefa(String titulo, String descricao, int id) throws Exception{
    }
    
    public void InativarTarefa(int id) throws Exception{
        boolean ativo = false;
        Tarefas tarefa = new Tarefas(id, ativo);
        repository.InativarTarefa(tarefa);
    }
    
    public List<Tarefas> listarTarefas() throws Exception{
        return repository.listarTarefas();
    }
    
    public void AtenderTarefa(int id) throws Exception{        
        Tarefas.StatusTarefa status = Tarefas.StatusTarefa.EM_ANDAMENTO;
        
        Tarefas tarefa = new Tarefas(id, status);
        repository.AlterarStatusTarefa(tarefa);
    }
    
    public void ConcluirTarefa(int id) throws Exception{        
        Tarefas.StatusTarefa status = Tarefas.StatusTarefa.CONCLUIDA;
        
        Tarefas tarefa = new Tarefas(id, status);
        repository.AlterarStatusTarefa(tarefa);
    }

    public void EstornarTarefa(int id) throws Exception{
        Tarefas tarefa = new Tarefas();
        if (tarefa.getStatus() == Tarefas.StatusTarefa.EM_ANDAMENTO){
            Tarefas.StatusTarefa status = Tarefas.StatusTarefa.PENDENTE;
            
            tarefa = new Tarefas(id, status);
            repository.AlterarStatusTarefa(tarefa);
        }
        else if(tarefa.getStatus() == Tarefas.StatusTarefa.CONCLUIDA){
            Tarefas.StatusTarefa status = Tarefas.StatusTarefa.EM_ANDAMENTO;
            
            tarefa = new Tarefas(id, status);
            repository.AlterarStatusTarefa(tarefa);
        }
    }
}
