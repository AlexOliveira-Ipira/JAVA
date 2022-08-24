public class App {
    public static void main(String[] args) throws Exception {
    System.out.println();
    // Processamento de dados com Java
    // Exemplo 1 - calculando valores inteiros

    int a , b;

    a = 5;
    b = 2 * a;
    
    System.out.println("Calculo valores inteiro.");
    System.out.println(a);
    System.out.println(b);
    System.out.println();

    // Exemplo 2 - calculando valores inteiros e double
    

    double c;

    c = 2 * a;
    System.out.println("Calculo entre int e double");
    System.out.println(a);
    System.out.println(c);
    System.out.println();

    // Exemplo 3 - Calculando area com dobloe

    double d, e, f, area;

    d = 6.0;
    e = 8.0;
    f = 5.0;

    area = (d + e) / 2.0 * f;

    System.out.println("Valor da Area com doble no calculo");
    System.out.println(area);
    System.out.println();

     // Exemplo 3 - Calculando area com float

     double df, ef, ff, areaf;

     df = 6f;
     ef = 8f;
     ff = 5f;
 
     areaf = (df + ef) / 2.0 * ff;
 
     System.out.println("Valor da Area com float no calculo");
     System.out.println(areaf);
     System.out.println();

     // Exemplo 4 - Calculando inteiro e armazenando em uma variavel double
        
     int g ,h;
     double resultado;

     g = 5;
     h = 2;

     resultado = g / h;

     System.out.println("Valor inteiro armazenado em uma variavel double");
     System.out.println(resultado);

    // Resolvendo o problema acima com a utilização do cast
    g = 5;
    h = 2;

    resultado = (double) g / h;

    System.out.println("Valor inteiro armazenado em uma variavel double");
    System.out.println("utilizando o cast durante a armazenagem dos dados.");
    System.out.println(resultado);
    System.out.println();

    // Exemplo 5
    double i;
    int j;

    i = 5.0;
    j = (int) i;
    
    System.out.println("Convertendo de double para int perdendo as casas decimais");
    System.out.println(j);
    System.out.println();

    



    }
}
