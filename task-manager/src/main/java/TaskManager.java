
import Model.Tarefas;
import Repository.TarefaRepository;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Windows
 */
public class TaskManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Teste do metodo de inserção de tarefas no banco de dados, interface ainda não está pronta*/
        System.out.println("Bem vindo ao sistema de lista de tarefas");
        
        System.out.println("Cadastrar tarefas teste de conexão de abnco de dados");
        
        System.out.println("Titulo da tarefa:");
        String titulo = sc.nextLine();
        System.out.println("Descrição da tarefa");
        String descricao = sc.nextLine();
        String status = "pendente";
        boolean ativo = true;
        Tarefas tarefa = new Tarefas(titulo, descricao, status, ativo);
        TarefaRepository repository = new TarefaRepository();
        try {
            repository.CadastrarTarefa(tarefa);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro para cadastrar tarefa - ERRO:" + erro);
        }
    }
    
}
