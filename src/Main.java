import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nome e calculo da idadegi
        int anoAtual = LocalDate.now().getYear();

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Em que ano você nasceu?");
        int anoNascimento = scanner.nextInt();

        int anos = anoAtual - anoNascimento;

        System.out.printf("Olá %s, você tem %d anos\n", nome, anos);

        // Calculo área do quadrado
        System.out.println("Qual o tamanho do lado do quadrado?");
        int ladoQuadrado = scanner.nextInt();
        int areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.printf("A área do quadrado é %d\n", areaQuadrado);


        // Calculo área do retangulo
        System.out.println("Qual o tamanho da altura do retangulo?");
        int alturaRetangulo = scanner.nextInt();
        System.out.println("Qual o tamanho da base do retangulo?");
        int baseRetangulo = scanner.nextInt();
        int areaRetangulo = alturaRetangulo * baseRetangulo;

        System.out.printf("A área do retangulo é %d\n", areaRetangulo);
        scanner.nextLine();


        // Calculo diferença de idade
        System.out.println("Qual seu nome?");
        String nomeA = scanner.nextLine();

        System.out.println("Qual o nome do seu amigo?");
        String nomeB = scanner.nextLine();

        System.out.println("Qual sua idade?");
        int idadeA = scanner.nextInt();
        System.out.println("Qual a idade do seu amigo?");
        int idadeB = scanner.nextInt();

        int diferencaIdade = idadeA - idadeB;

        System.out.printf("A diferença de idade entre %s e %s é: %d", nomeA, nomeB, diferencaIdade);
    }
}