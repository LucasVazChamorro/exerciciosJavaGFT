import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Valor inválido, por favor, insira a nota entre 0 e 10");
            nota = sc.nextInt();
        }

        System.out.println("A nota é: " + nota);
    }
}