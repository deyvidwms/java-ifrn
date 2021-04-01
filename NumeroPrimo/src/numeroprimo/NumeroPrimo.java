
package numeroprimo;

import java.util.Scanner;


public class NumeroPrimo {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um numero");
      int numero = sc.nextInt();
      int divisores = 0;
      for (int i = 2;i<numero;i++){
          if (numero%i==0){
              divisores++;
          }
      }
      if (divisores==0){
          System.out.println("Numero primo");
      }else{
          System.out.println("Não é primo");
          System.out.println("Qtde divisores "+divisores);
      }  
    }
    
}
