import java.util.Locale;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    System.out.println();
    // Entrada de dados com Java - Parte 1
    // usando p Scanner

    // Antes de digitar esse número deve ser 
    // definido a localização
    Locale.setDefault(Locale.US);

    Scanner entDados = new Scanner(System.in);
    
    // Entrada de dados até a quebra de linha
    String s1, s2, s3;

    System.out.print("Primeir linha: ");
    s1 = entDados.nextLine();
    System.out.print("Segunda linha: ");
    s2 = entDados.nextLine();
    System.out.print("Terceira linha; ");
    s3 = entDados.nextLine();

    System.out.println("Dados digitados: ");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println();

    //Resolvendo quebra de linha pendente
    //Gerando o erro.
    int x;
    String q1, q2, q3;

    System.out.println("Esperando digitar um valor numerico e 3 pequenos textos.");
    x = entDados.nextInt();
    q1 = entDados.nextLine();
    q2 = entDados.nextLine();
    q3 = entDados.nextLine();

    System.out.println("Dados digitados:");
    System.out.println(x);
    System.out.println(q1);
    System.out.println(q2);
    System.out.println(q3);
    System.out.println();

    // Resolvendo o erro acima
    System.out.println("Resolvendo o erro acima.");
    System.out.println("Esperando digitar um valor numerico e 3 pequenos textos.");
    x = entDados.nextInt();
    entDados.nextLine();
    q1 = entDados.nextLine();
    q2 = entDados.nextLine();
    q3 = entDados.nextLine();
    System.out.println();

    System.out.println("Dados digitados após a correção:");
    System.out.println(x);
    System.out.println(q1);
    System.out.println(q2);
    System.out.println(q3);

    entDados.close();
    }
}
