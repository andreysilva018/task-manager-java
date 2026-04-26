
import View.frmTela;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author Windows
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema");
        try {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Windows".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new frmTela().setVisible(true);
        });
    }
    
}
