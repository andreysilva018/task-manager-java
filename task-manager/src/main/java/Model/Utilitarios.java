/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Windows
 */
public class Utilitarios {
    
    public void LimpaTela(JPanel container){
       Component components[] = container.getComponents();
       for(Component component : components){
           if(component instanceof JTextField){
               ((JTextField) component).setText("");
           }
           if(component instanceof JTextArea){
               ((JTextArea) component).setText("");
           }
           if(component instanceof JScrollPane){
               JScrollPane scroll = (JScrollPane) component;
               
               Component view = scroll.getViewport().getView();
               if(view instanceof JTextArea){
                   ((JTextArea) view).setText("");
               }
           }
       }
    }
    
}
