import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
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
    */

        // Calculo tabuada
        System.out.println("Escreva um número:");
        int numeroCalculado = scanner.nextInt();
        for(int numeroTabuada = 1; numeroTabuada <= 10; numeroTabuada++){
            System.out.printf(numeroCalculado + " x " + numeroTabuada + " = " + (numeroCalculado * numeroTabuada) + "\n");
        }

        //Calculo IMC
        System.out.println("Escreva sua altura:");
        double altura = scanner.nextDouble();
        System.out.println("Escreva seu peso:");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc <= 18.5){
            System.out.println("IMC: " + imc + "\nAbaixo do peso");
        } else if (18.6 <= imc && imc <= 24.9){
            System.out.println("IMC: " + imc + "\nPeso ideal");
        } else if (25 <= imc && imc <= 29.9){
            System.out.println("IMC: " + imc + "\nLevemente acima do peso");
        } else if (30 <= imc && imc <= 34.9){
            System.out.println("IMC: " + imc + "\nObesidade Grau I");
        } else if (35 <= imc && imc <= 39.9){
            System.out.println("IMC: " + imc + "\nObesidade Grau II(Severa)");
        } else {
            System.out.println("IMC: " + imc + "\nObesidade Grau III(Mórbida)");
        }

        //Calculo intervalo de numeros impares e pares
        System.out.println("Escreva o 1º número:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Escreva o 2º numero:");
        int segundoNumero = scanner.nextInt();
        System.out.println("Par ou impar? (par/impar)");
        String parOuImpar = scanner.next().toLowerCase();

        switch (parOuImpar){
            case "par":
                for (int i = segundoNumero; i>=primeiroNumero; i--){
                    if( i % 2 == 0){
                        System.out.println(i);
                    }
                }
                break;

            case "impar":
                for (int i = segundoNumero; i>=primeiroNumero; i--){
                    if( i % 2 != 0){
                        System.out.println(i);
                    }
                }
                break;
        }

        //Calculo número divido por 2
        System.out.println("Escreva o 1º número:");
        int primeiroNumeroA = scanner.nextInt();
        System.out.println("Escreva o 2º numero:");
        int segundoNumeroB = scanner.nextInt();

        while (segundoNumeroB % primeiroNumeroA != 0){
            System.out.println("Valor restante da divisão é: " + segundoNumeroB % primeiroNumeroA);

            System.out.println("Escreva novamente o 2º numero:");
            segundoNumeroB = scanner.nextInt();

            while(segundoNumeroB <= primeiroNumeroA){
                System.out.println("Escreva 2º numero maior que o 1º:");
                segundoNumeroB = scanner.nextInt();
            }
        }

    }
}