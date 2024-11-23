import java.text.MessageFormat;
import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int pares = 0;
        int impares = 0;
        String continuar = "";

        do {
            System.out.println("Número: ");
            N = sc.nextInt();
            if (N % 2 == 0){
                pares++;
            } else {
                impares++;
            }
            System.out.println("Deseja continuar? [S/N]");
            sc.nextLine();
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println(String.format("Números pares: %d\nNúmeros ímpares: %d", pares, impares));
    }
}
