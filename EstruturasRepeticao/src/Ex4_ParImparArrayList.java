import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_ParImparArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int pares = 0;
        int impares = 0;
        String continuar;

        do {
            System.out.print("Número: ");
            int N = sc.nextInt();
            numeros.add(N); // Armazena o número no ArrayList

            if (N % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            System.out.print("Deseja continuar? [S/N]: ");
            sc.nextLine(); // Consumir o caractere de nova linha pendente
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        // Exibindo os números digitados
        System.out.println("Números digitados: " + numeros);
        System.out.println(String.format("Números pares: %d\nNúmeros ímpares: %d", pares, impares));

        sc.close(); // Fecha o scanner
    }
}
