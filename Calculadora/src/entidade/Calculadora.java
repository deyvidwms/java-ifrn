
package entidade;


public class Calculadora {
    
    private float a;
    private float b;
    
    public Calculadora(){
        a = 0;
        b = 0;
    }
    
    public float getA(){
        return a;
    }
    
    public void setA(float a){
        this.a = a;
    }
    
    public float getB(){
        return b;
    }
    
    public void setB(float b){
        this.b = b;
    }
        
    public float somar(){
        return a+b;
    }
    
    public float subtrair(){
        return a - b;
    }
    
    public float multiplicar(){
        return a*b;
    }
    
    public float dividir(){
        if(b != 0){
            return a/b;
        }else{
            throw new ArithmeticException();
        }
    }
    
}
