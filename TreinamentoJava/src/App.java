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
    // Laço de repetição while
    System.out.print("Em qual numero estou pensando? ");
    int numero = entDados.nextInt();
    int soma = 0;

    while (numero != 20) {
        soma += numero;
        System.out.print("Não é esse o número, digite um novo numero: ");
        numero = entDados.nextInt();
    }
    System.out.println("Essa é a soma dos números digitados. " + soma);
    System.out.println("Esse é o número que eu estava pensando 20");
 
    entDados.close();
    }
}
