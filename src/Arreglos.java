import java.util.Scanner;

public class Arreglos {
    // definimos el arreglo notas
    int[] notas;
    Scanner scanner;


    //metodo constructor
    public Arreglos(){
        notas = new int[5];
        scanner = new Scanner(System.in);
    }

    //metodo ejecutar
    public  void  ejecutar( ){
        for (int i = 0 ; i < notas.length; i++){
            System.out.println("notas(" + i + ")");
            int nota = scanner.nextInt();

            notas[i] = nota;
        }
        int suma = 0;
        double promedio;
        int minimo = 10;
        int maximo = 0;
        for (int i = 0;i < notas.length; i++){
            System.out.println("notas(" + i + ")");

            suma =suma + notas[i];

            if (notas[i] < minimo);{
                minimo= notas[i];
            }

            if (notas[i] > maximo);{
                maximo = notas[i];
            }

        }

        promedio = suma / notas.length;

        System.out.println("PROMEDIO: " + promedio);
        System.out.println("MAXIMO:" + maximo);
        System.out.println("MINIMO: " + minimo);
    }

}
