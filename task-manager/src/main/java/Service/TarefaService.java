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
        Tarefas tarefa = new Tarefas(titulo, descricao, id);
        repository.AtualizarTarefa(tarefa);
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

    public void EstornarTarefa(Tarefas tarefa) throws Exception{
        if (tarefa.getStatus() == Tarefas.StatusTarefa.EM_ANDAMENTO){
            tarefa.setStatus(Tarefas.StatusTarefa.PENDENTE);
            repository.AlterarStatusTarefa(tarefa);
        }
        else if(tarefa.getStatus() == Tarefas.StatusTarefa.CONCLUIDA){
            tarefa.setStatus(Tarefas.StatusTarefa.EM_ANDAMENTO);
            repository.AlterarStatusTarefa(tarefa);
        }
    }
}
