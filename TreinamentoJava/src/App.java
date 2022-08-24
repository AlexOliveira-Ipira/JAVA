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

    int dia;
    String diaSemana;
    System.out.print("Digite um valor de 1 a 7 para o dia da semana: ");
    dia = entDados.nextInt();

    switch(dia){
        case 1:
            diaSemana = "Domingo";
            break;
        case 2:
            diaSemana = "Segunda";
            break;
        case 3:
            diaSemana = "Terça";
            break;
        case 4:
            diaSemana = "Quarta";
            break;
        case 5:
            diaSemana = "Quinta";
            break;
        case 6:
            diaSemana = "Sexta";
            break;
        case 7:
            diaSemana = "Sabado";
            break;
        default:
            diaSemana = "Valor invalido";
            break;
    }

    System.out.println("Dia da semana: " + diaSemana);

    entDados.close();
    }
}
