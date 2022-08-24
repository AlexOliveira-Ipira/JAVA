import java.util.Locale;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    System.out.println();
    Locale.setDefault(Locale.US);

    Scanner entDados = new Scanner(System.in);
    //Estrutura repetitiva "Faça-enquanto" - Do while
    char resp;

    do{
        System.out.print("Digite a temperatura em Celsius: ");
        double C = entDados.nextDouble();
        double F = 9.0 * C / 5.0 + 32;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
        System.out.print("Deseja repetir (s/n)? ");
        resp = entDados.next().charAt(0);
    }while(resp != 'n');

    System.out.println("Fim!");
 
    entDados.close();
    }
}
