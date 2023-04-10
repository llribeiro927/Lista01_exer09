import java.util.Scanner;
import java.util.Locale; 

public class App {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que peça a temperatura em graus Fahrenheit, 
        // transforme e mostre a temperatura em graus Celsius.
        // C = 5 * ((F-32) / 9).
        float fahrenheit;
        float celsius;  



        Locale locale = new Locale("pt", "BR"); 



       System.out.println("A temperatura em graus Fahrenheit é de: ");
       Scanner teclado = new Scanner(System.in); 
       fahrenheit = teclado.nextFloat(); 

       celsius = 5 * ((fahrenheit -32 / 9)); 

       System.out.println("A temperatura em graus Celsius é de: " + celsius);
       teclado.close(); 
        
    }
}
