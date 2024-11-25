import java.util.*;

class ProgessoesGeometricas{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); // O número de casos de teste
        for(int i=0;i<t;i++){ // Este loop executará 𝑡 t vezes (um para cada caso de teste).
            int a = in.nextInt(); // a é o valor inicial da série
            int b = in.nextInt(); // b é o fator de multiplicação para os termos subsequentes
            int n = in.nextInt(); // n é o número de termos a serem gerados para a série.

            int sum = a;
            for(int j=0; j<n; j++){
                sum = sum + (int)(Math.pow(2,j)*b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        in.close();
    }
}