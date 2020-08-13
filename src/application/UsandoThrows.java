package application;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno Prestes
 */
public class UsandoThrows {
       public static void main(String[] args) {
        
        System.out.println("Entre com um número decimal");
           try {
               double num = leNumero();
               System.out.println("Você digitou " + num);
           } catch (Exception e) {
               System.out.println("Entrada inválida");
               e.printStackTrace();
           }
        
    }
       
    public static double leNumero() throws Exception{
        
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }   
}

//Sempre viável usar o printStackTrace para desenvolvedores
//na construção do programa

//Para o usuário final não é recomendado tratar a exceção com 
//printStackTrace pois usuários mal-intencionados, podem danificar o programa