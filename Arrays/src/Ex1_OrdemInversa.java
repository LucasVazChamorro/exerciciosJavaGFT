public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int count = 0;

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Vetor ordem normal com while: ");
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nVetor ordem normal com for: ");
        for(int j = 0; j < (vetor.length); j++){
            System.out.print(vetor[j] + " ");
        }

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nVetor ordem inversa com for: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nVetor ordem inversa com while: ");
        int contador = 0;
        while(contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}