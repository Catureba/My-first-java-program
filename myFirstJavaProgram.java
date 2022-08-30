import java.util.Scanner;

public class  myFirstJavaProgram{
    public static void main(String[] args) {
        String nome;
        int idade;

        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = sc.nextLine();

        
        System.out.println("Digite sua idade");
        idade = sc.nextInt();

        System.out.println("seu nome é: " + nome + "e sua idade é: " + idade);


        
    }
}