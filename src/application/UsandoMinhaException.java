package application;

public class UsandoMinhaException {
    public static void main(String[] args) {
        
        //Arrays de múltiplos de 2 e de 4
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        
        //denominadores
        int[] demon = {2, 0, 4, 8, 0, 2 , 3};
        
        for (int i = 0; i < numeros.length; i++) {
            try{
                if (numeros[i] % 2 != 0) {
                    //Essa mensagem está no getMessage da Exception e
                    throw new Exception("Número"
+ " ímpar, divisão não exata");
                }
                System.out.println(numeros[i] + "/" 
            + demon[i] + " = " + 
            (numeros[i]/demon[i]));
            }
            
            //Toda vez que for capturada uma exceção irá capturar um erro
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e1){
                System.out.println("Aconteceu um erro");
            }
           
            catch(Exception e) {
                System.out.println();
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage() + "ERRADASSO");
            }
        }
    }
}
