import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        //Define a localização do programa, 
        //colocando o ponto no lugar da virgula. 
        Locale.setDefault(Locale.US);

        // Printls - Utiliza essa função para pular uma linha.
        int a = 22;
        System.out.println("Olá mundo!");
        System.out.println(a);
        System.out.println();

        // Print- Utiliza essa função para imprimir na mesma linha.
        System.out.print("Olá mundo!");
        System.out.println(a);
        System.out.println();
     
    
        // Saida de dados com ponto flutuante
        double x = 10.35784;
        System.out.println("Valor da variavel " + x);

        // System.out.printf -  Utilizado para criar mascaras em double
        System.out.printf( "Valor com 2 casas decimais " + "%.2f%n", x);
        System.out.printf( "Valor com 4 casas decimais " + "%.4f%n", x);

        //Concatenar vários elementos em um mesmo comando de escrita
        //Definindo variáveis
        String nome = "Maria";
        int idade  = 31;
        double renda = 4000.0;
        //Saída do comando
        //Marcadores:
            //%f = ponto flutuante
            //%d = inteiro
            //%s = texto
            //%n = quebra de linha
        System.out.println();
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
