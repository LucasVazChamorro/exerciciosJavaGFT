import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabular = 0;

        System.out.println("Informe o número a ser tabulado: ");
        tabular = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(tabular + " X " + i + " = " + (tabular * i));
        }
    }
}
