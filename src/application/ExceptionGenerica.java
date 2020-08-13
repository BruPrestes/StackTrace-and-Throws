package application;

/**
 *
 * @author Bruno Prestes
 */

public class ExceptionGenerica {
    
    public static void main(String[] args) {
        
        //Arrays de múltiplos de 2 e de 4
        int[] numeros = {4, 8, 16, 32, 64, 128};
        
        //denominadores
        int[] demon = {2, 0, 4, 8, 0};
        
        for (int i = 0; i < numeros.length; i++) {
            try{
            //O try faz com que o programa continue executando     
                System.out.println(numeros[i] + "/" 
            + demon[i] + " = " + 
            (numeros[i]/demon[i]));
            }
            //O Exception sozinho irá abranger todos os exceptions que podem ocorrer
            catch(Exception e){
                
                //O get message trás automaticamente o que ocorreu
                System.out.println(e.getMessage());
                //Print StackTrace retorna a linha que ocorreu o erro
                e.printStackTrace();
            }
            
        }
    }
                
}
