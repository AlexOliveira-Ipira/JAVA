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
    //Expressão condicional ternária
    // Sintax 
    // ( condição) ? valor_se_verdadeiro : valor_se_falso


    //Exempo de if sem condição ternaria
    System.out.println("Exemplo de if sem condição ternária");
    double preco = 34.5;
    double desconto;

    if(preco < 20.0){
        desconto = preco * 0.01;
    }else{
        desconto = preco * 0.05;
    }
    System.out.println(desconto);
    System.out.println();

    //fazendo a condição acima utiliznado a condição ternária
    System.out.println("Resultado utilizando a condição ternária");
    System.out.println((preco < 20.0) ? preco * 0.1 : preco * 0.05);
 
    entDados.close();
    }
}
