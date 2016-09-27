/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainagenda;
import java.util.Scanner;


/**
 *
 * @author md10
 */
public class MainAgenda {


    public static void main(String[] args) {
        
        Contato b = new Contato();
        Agenda agenda = new Agenda();
        
        agenda.adicionarContatos(b);
        
        System.out.println(b.nome);
        System.out.println(b.endereco);
        System.out.println(b.telefone);
        
        
        
        
        
        
        
        
        
    }
    
}
