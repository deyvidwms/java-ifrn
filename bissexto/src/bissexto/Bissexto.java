
package bissexto;

import java.util.Scanner;

public class Bissexto {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano");
        int ano = sc.nextInt();
        if(ano %400 == 0){
            System.out.println("Ano bissexto");
        }else if (ano % 4 == 0 && ano % 100 != 0){
            System.out.println("Ano Bissexto");
        }else{
            System.out.println("Não é bissexto");
        }
    }
       
}