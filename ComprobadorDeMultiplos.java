

public class ComprobadorDeMultiplos{
        
    public boolean esMultiploDe2(int numero){
        boolean respuesta = false;
        if ((numero % 2 == 0) && (numero >= 2)){
            respuesta = true;
           }        
        return respuesta;
    } 

    public boolean esMultiploDe5(int numero){
        boolean respuesta = false;
        if ((numero % 5 == 0) && (numero >= 5)){
            respuesta = true;
        }
        return respuesta;
    }
    
    public boolean esMultiploDe(int a, int b){   
        boolean respuesta = false;
        if ((a >= b) && (b > 0) && (a >= 0) && (b != 0) && (a % b == 0)){
            respuesta = true;
        }
        return respuesta;
    }
}
