import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;

        do {
            System.out.print("Letra: ");
            String letra = sc.next();

            // Verificar se a letra é uma consoante
            if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        // Imprimir as consoantes
        System.out.print("Consoantes digitadas: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        // Informar a quantidade de consoantes
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);

        sc.close(); // Fecha o scanner
    }
}
