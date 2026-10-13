package oneWeek.oneDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // EX 1
//        String nome = "João";
//        int idade = 18;
//        double altura = 1.75;
//        System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f\n", nome, idade, altura);
//
//        // EX 2
//        int n1, n2;
//        System.out.println("Digite o primeiro número: ");
//        n1 = sc.nextInt();
//        System.out.println("Digite o segundo número: ");
//        n2 = sc.nextInt();
//        System.out.printf("Soma: %d\n", n1 + n2);
//        System.out.printf("Subtração: %d\n", n1 - n2);
//        System.out.printf("Multiplicação: %d\n", n1 * n2);
//        System.out.printf("Divisão: %d\n", n1 / n2); // Como é int, o resultado irá pegar apenas a parte inteira.

        // EX 3
        double grausC, grausFah;
        System.out.println("Digite a temperatura em Celsius");
        grausC = sc.nextDouble();
        grausFah = (grausC * 1.8) + 32;
        System.out.printf("Graus em Celsius: %.2f\nGraus em Fahrenheit: %.2f\n", grausC, grausFah);

    }
}
