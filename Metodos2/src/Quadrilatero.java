public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Área do quadrado:  " + lado * lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio:  " + ((baseMenor + baseMaior) * altura) / 2);
    }

    // como serão dois parâmetros, precisamos alterrar o nome e o tipo do parâmetro para a sobrecarga funcionar!
    public static void area(float diagonal1, float diagonal2){
        System.out.println("Área do losango:  " + (diagonal1 + diagonal2) / 2);
    }
}
