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
public class Agenda {
    Contato[] contatos = new Contato[100];
    Scanner teclado = new Scanner(System.in);
            
    public void adicionarContato(Contato c){
        
        System.out.print("Entre com o nome: ");
        c.nome = teclado.nextLine();
        
        System.out.print("Entre com o endereço: ");
        c.endereco = teclado.nextLine();
        
        System.out.print("Entre com o telefone: ");
        c.telefone = teclado.nextLine();
        
        System.out.println("Contato Adicionado!!!");
         
    }
    
    public void removerContato(){
        
        listarContatos();
        System.out.print("Digite o numero do contato que quer remover: ");
        
        
        
    }
}



