

public class ComprobadorDeMultiplos{
        
    public boolean esMultiploDe2(int numero){
        boolean respuesta = false;
        if (numero % 2 == 0){
            respuesta = true;
        }
        return respuesta;
    } 

    public boolean esMultiploDe5(int numero){
        boolean respuesta = false;
        if (numero % 5 == 0){
            respuesta = true;
        }
        return respuesta;
    }
    
    public boolean esMultiploDe(int numero, int divisor){   
        boolean respuesta = false;
        if (numero % divisor == 0){
            respuesta = true;
        }
        return respuesta;
    }
}
