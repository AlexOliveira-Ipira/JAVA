import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    System.out.println();
  
    // Expressões condicional simples 
    // Neste exemplo o if é verdadeiro com isso imprime as 3 informações
     
    int hora = 5;

    System.out.println("Exemplo de if simples com valor verdadeiro");
    System.out.println("Bom dia");

    if(hora > 0){
        System.out.println("Boa tarde");
    }
    System.out.println("Boa noite");
    System.out.println();


    // Expressôes condiciona simples
    // Neste exemplo o if é falso com isso imprime so os 2 itens que estão fora do if

    System.out.println("Exemplo de if simples com valor falso");
    System.out.println("Bom dia");
    
    if(hora < 0){
        System.out.println("Boa tarde");
        System.out.println();
    }

    System.out.println("Boa noite");
    System.out.println();

    //Exemplo de if composto
    Scanner entDados = new Scanner(System.in);
    int horas;
    System.out.print("Quantas horas? ");
    horas = entDados.nextInt();

    if(horas < 12){
        System.out.println("Bom dia");
        System.out.println();
    }else{
        System.out.println("Boa tarde");
        System.out.println();
    }

    //Exemplo de encadeamento de estruturas condicionais
    System.out.println("Hora encadeamento:");
    System.out.print("Quantas horas? ");
    horas = entDados.nextInt();

    if(horas <12){
        System.out.println("Bom dia");
    }
    else if(horas < 18){
        System.out.println("Boa tarde");
    }
    else{
        System.out.println("Boa noite");
    }
    entDados.close();
    }
}
