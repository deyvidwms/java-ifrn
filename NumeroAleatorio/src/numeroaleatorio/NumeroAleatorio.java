
package numeroaleatorio;

import java.util.Random;

/*Aqui Foi Importado a Classe "Random"
para ser usado mais embaixo...
*/

public class NumeroAleatorio {

    public static void main(String[] args) {
        
        Random num = new Random();
        System.out.println(num.nextInt(6)+1);
        //Vai de 1 até 6, para caso queira usar como um DADO...
    }
    
}
