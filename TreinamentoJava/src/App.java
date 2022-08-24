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
    // Estrutura de repetição FOR
    System.out.print("Digite um número: ");
    int numero = entDados.nextInt();
    int soma = 0;

    for (int i=0 ; i < numero; i++){
        System.out.print("Digite um numeor para acrescentar na soma: ");
        int x = entDados.nextInt();
        soma += x;
    }

    System.out.println("A soma dos números é: " + soma);
 
    entDados.close();
    }
}
