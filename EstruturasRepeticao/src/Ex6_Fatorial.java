import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicador = 1;

        for (int i = fatorial; i >= 1; i--){
            multiplicador = multiplicador * i;
        }

        System.out.println(fatorial+"! = " + multiplicador);
    }
}
