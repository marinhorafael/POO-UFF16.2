package anagrama;
import java.util.Scanner;

/**
 *
 * @author Rafael Marinho
 */
public class Anagrama {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String palavra1,palavra2,aux;
        int posPalavra2;
        boolean anagrama;
        
        System.out.print("Digite a primeira palavra: ");
        palavra1 = teclado.nextLine().trim();
        System.out.print("Digite a palavra que será comparada: ");
        palavra2 = teclado.nextLine().trim();
        anagrama = true;
        aux = palavra2;
        
        if (palavra1.length() == palavra2.length()){
            
            for (int i=0; i < palavra1.length(); i++){
                
                posPalavra2 = palavra2.indexOf(palavra1.charAt(i),0);
                if (posPalavra2 == -1){
                    
                    anagrama = false;   
                    break;
                }else {
                    
                    palavra2 = ((palavra2.substring(0,posPalavra2)) + (palavra2.substring(posPalavra2 + 1 ,palavra2.length())));  
                    System.out.println(palavra2);
                }
            }        
        } else{
            
            anagrama = false;
        }
        
        /*testar se é anagrama*/
        if (anagrama){
            
            System.out.println("A palavra " + palavra1 + " é um ANAGRAMA da palavra " + aux);
        } else
            
            System.out.println("A palavra " + palavra1 + " não é um ANAGRAMA da palavra " + aux);
    }
    
}