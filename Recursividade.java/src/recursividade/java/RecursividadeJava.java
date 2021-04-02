
package recursividade.java;

import java.util.Random;
import java.util.Scanner;

public class RecursividadeJava {

    public static int Fatorial(int x){
        if (x <= 1){
            return 1;
        }else{
            return x*Fatorial(x-1);
        }        
    }    

    public static String converteBin(int x){
        //String N = " ";
        if (x == 1 || x == 0){
            return x % 2 + "" ;
        }else{
            String N = " ";
            N += x % 2;
            x /= 2;
            return converteBin(x) + N;
        }
    }
    
    public static int Mult(int x, int y){
        if (x == 1){
            return y;
        }else{
            
            return y + Mult(--x,y);
        }
    }
    
    public static int Soma(int x, int y){
        if(y == 0){
            return x;
        }else{
            return Soma(++x, --y);
        }
    }
    
    public static int somaN(int x){
        if(x == 0){
            return 0;
        }else{
            
            return x + somaN(--x);
        }
    }
    
    public static int potencia(int x, int y){
        if(y == 1){
            return x;
        }else if(y == 0){
            return 1;
        }else{
            return x*potencia(x,--y);
        }
        
    }
    
    public static int contador(int x, int y){ 
        if (x < y){
            System.out.print(x + " ");
            return contador(++x,y);
        }else{
            return y;
        }    
            
    }
    
    public static int contReverso(int x, int y){
        if(x > y){
            System.out.print(x +" ");
            return contReverso(--x,y);
        }else{
            return x;
        }
    }
    
    public static int somaDiagonal(int t, int m[][]){
        int s = 0;
        for (int i = 0; i < t; i++){
            for (int j = 0; j < t; j++){
                if(i == j){
                    s += m[i][j];
                }
            }
        }
        return s;
    }
    
    public static int somaDiag(int a,int b, int m[][]){
        int s = 0;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if(i == j){
                    s += m[i][j];
                }
            }
        }
        return s;
    }
    
    public static boolean Perfeito(long numeroPerf){
    int aux=0;
    for (int i=1 ;i<numeroPerf;i++){
        if (numeroPerf % i==0){
        aux=i+aux;
        }
    }
    
    if (aux==numeroPerf){
        return true;
    }else
        return false;
    }
    
    public static void main(String[] args) {
        
        System.out.println(Fatorial(5));
        
        System.out.println(converteBin(10));
        
        System.out.println(Mult(6,4));
        
        int d = (Soma(3,2));
        System.out.println(d);
        
        int e = (somaN(5));
        System.out.println(e);
        
        int f = (potencia(5,2));
        System.out.println(f);
        
        int g = (contador(1,10));
        System.out.println(g);
        
        int h = (contReverso(10,1));
        System.out.println(h);
        
        
        
        int m = 6;
        int n = 5;
        System.out.println((n > 0)? "Maior" : "Menor");
        System.out.println((m > n)?((m%2 == 1)?"Ímpar":"Par"):"B maior");
        
        
        Scanner s = new Scanner(System.in);
        Random ran = new Random();
        
        int tam = s.nextInt();
        int matriz[][] = new int[tam][tam];
        
        for (int i = 0; i < tam;i++){
            for(int j = 0; j < tam;j++){
                matriz[i][j] = s.nextInt();
            }
        }
        /*
        int a = somaDiagonal(tam, matriz);
        System.out.println("Soma da Diagonal Principal: "+a);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        int matriz[][] = new int[a][b];
        
        for (int i = 0; i < a;i++){
            for(int j = 0; j < b;j++){
                matriz[i][j] = s.nextInt();
            }
        }
        
        int c = somaDiag(a,b,matriz);
        System.out.println("Soma da diagonal principal: "+c);
        
        System.out.println(Perfeito(6));
        */
        
        
    }
    
    
}
