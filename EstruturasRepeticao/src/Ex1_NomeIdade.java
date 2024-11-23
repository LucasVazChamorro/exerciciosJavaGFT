import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nomeAluno = "";
    int idade;

    while(true){
        System.out.println("Nome: ");
        nomeAluno = sc.next();

        if (nomeAluno.equals("0")){
            break;
        }

        System.out.println("Idade: ");
        idade = sc.nextInt();


        System.out.println(String.format("O nome do aluno é %s e sua idade é de %d anos", nomeAluno, idade));
    }
    }


}

