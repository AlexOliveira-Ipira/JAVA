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
    
    // digitando String
    String nome;
    System.out.print("Digite seu nome: ");
    nome = entDados.next();

    // Digitando Inteiro
    int idade;

    System.out.print("Digite sua idade: ");
    idade = entDados.nextInt();


    // Digitar número com ponto flutuante
    

    double altura;

    System.out.print("Digite a sua altura: ");
    altura = entDados.nextDouble();


    System.out.printf("Seu nome é %s  a sua idade é %d e a sua altura é %.2f.%n" ,nome, idade, altura);
   
    // Pegando o primeiro caracter de uma palavra digitada
    char primeiraLetra;
    System.out.println("Digite uma palavra.");
    primeiraLetra = entDados.next().charAt(0);
    System.out.println("A primeira letra dessa palavra é: " +  primeiraLetra);
    

    entDados.close();
    }
}
