public class RodarAplicacao {
    public static void main(String[] args) {

        //criação de um vetor Classe Mae chamado classe, com três objetos
        ClasseMae[] classes = new ClasseMae[]{new CasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //foreach
        for (ClasseMae classe: classes){
            // metodo1 está na classe mãe, foi sobrescrito na classe filha1 e 2, e passando neste programa houve um polimorfismo para os dois primeiros objetos;
            classe.metodo1();
        }

        System.out.println("");
            // não tem polimorfismo no primeiro objeto, mas tem no segundo, e não tem no terceiro
        for (ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");


        //sobrescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
