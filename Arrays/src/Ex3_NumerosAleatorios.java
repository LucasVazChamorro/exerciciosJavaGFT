import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessores dos Números Aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1) + " ");
        }

        System.out.println("\nAntecessores dos Números Aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.println((numero - 1) + " ");
        }
    }
}
