import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void bogosort(int[] numeros, int n, Random gerador){
        boolean sorted = false;
        while(!sorted){
            for(int i = 0; i < numeros.length; i++){
                int aux = numeros [i];
                int j = gerador.nextInt(n);
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
            sorted = isSorted(numeros);
        }
        System.out.println("Ordenado ai meu patrão:");
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

    }

    public static boolean isSorted (int[] numeros){
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < numeros [i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        long tempoInicial = System.currentTimeMillis();


        System.out.println("-------------BOGOSORT PIKA PRA CARALHO-------------");
        System.out.println("Digita um número aí");
        int n = teclado.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++){
            numeros[i] = gerador.nextInt(100);
        }

        bogosort(numeros, n, gerador);
        System.out.println("Tempo de execução:");
        double seconds = (System.currentTimeMillis() - tempoInicial)/1000.00; 
        System.out.println(seconds+ " segundos");

        teclado.close();

    }
    
}
