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
    //Sintaxe opcional - operadores de atribuição cumulativa
    /*
     * a == b; == a = a + b
     * a -= b; == a = a - b;
     * a *= b; == a = a * b;
     * a /= b; == a = a / b;
     * a %= b; == a = a % b;
     * 
     */
    Scanner entDados = new Scanner(System.in);
        
    System.out.print("Digite o valor do consumo em minutos: ");
    int minutos = entDados.nextInt();

    double conta = 50.0;

    if(minutos > 100){
        // Usando operador de atribuição cumulativa
        conta += (minutos - 100) * 2.0;
    }

    System.out.printf("Valor da conta = R$ %.2f%n" , conta);
    entDados.close();
    }
}
