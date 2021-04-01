
package aula1;

import java.util.Scanner;

public class Aula1 {

    
    public static void main(String[] args) {
  
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite seu nome");
       String nome = sc.nextLine();
       System.out.println("O nome é "+nome);
       
       System.out.println("Digite sua idade:");
       int idade = sc.nextInt();
       System.out.println("Sua idade é "+idade);
       
       if (idade >= 18){
           System.out.println("Maior de Idade");
          
       }else{
           System.out.println("Menor de Idade");
           
       }
    }
    
    
}
