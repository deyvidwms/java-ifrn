
package caculadoradowhile;

    import java.util.Scanner;


public class CaculadoraDoWhile {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int x = 0;

        
        do{
        
            double num1, num2, resultado;

            num1 = num2 = resultado = 0;


            System.out.println("Escolha uma opção: ");
            System.out.println(" 1) Soma");
            System.out.println(" 2) Subtracao");
            System.out.println(" 3) Multiplicacao");
            System.out.println(" 4) Divisao");
            System.out.println(" 0) Sair");


            System.out.println("Digite a opção: ");
            x = in.nextInt();

            if (x != 0){

                System.out.println(" Digite o primeiro número: ");
                num1 = in.nextDouble();

                System.out.println(" Digite o segundo número: ");
                num2 = in.nextDouble();

                if (x==1){
                    resultado = num1 + num2;
                }else{
                    if(x==2){
                        resultado = num1 - num2;
                    }else{
                        if(x==3){
                            resultado = num1*num2;
                        }else{
                            if(x==4){
                                resultado = num1/num2;
                            }
                        }
                    }
                }
            System.out.println();
            System.out.println("O resultado é "+resultado);   
            System.out.println();
            }
            
        }while(x!=0);
    }
    
}
