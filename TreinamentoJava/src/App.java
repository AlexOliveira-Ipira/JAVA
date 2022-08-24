import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    System.out.println();
    // Funções (sintaxe)

    Scanner entDados = new Scanner(System.in);

    System.out.println("Enter three numbers: ");
    int a = entDados.nextInt();
    int b = entDados.nextInt();
    int c = entDados.nextInt();

    int higher = max(a, b, c);

    showResult(higher);


    entDados.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
