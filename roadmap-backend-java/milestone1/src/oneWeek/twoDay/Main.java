package oneWeek.twoDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // EX 1
        // int n1;
        // n1 = sc.nextInt();
        // if (n1 % 2 == 0){
        //    System.out.println("O número é par!");
        //} else {
        //    System.out.println("O número é ímpar!");
        //}

        // EX 2
        //double nota;
        //nota = sc.nextDouble();
        //boolean aprovado = false;
        //boolean recuperacao = false;

        //if (nota >= 6){
        //    aprovado = true;
        //} else if (nota >= 4){
        //  recuperacao = true;
        //}

        // if (recuperacao){
        //    System.out.println("Deve fazer a recuperação.");
        //}

        // if (aprovado){
        //    System.out.println("Aprovado!");
        //} else {
        //    System.out.println("Reprovado.");
        //}

        // EX 3
        //int n;
        //n = sc.nextInt();
        //System.out.printf("==== Tabuada do %d com For =====\n", n);
        //for (int i = 1; i <= 10; i++){
        //    System.out.printf("%d * %d = %d\n", n, i, n * i);
        //}

        //System.out.printf("==== Tabuada do %d com While =====\n", n);
        //int i = 1;
        //while (i <= 10){
        //    System.out.printf("%d * %d = %d\n", n, i, n * i);
        //    i++;
        //}

        // EX 4
        int soma = 0;
        for (int i = 1; i < 101; i++){
            System.out.printf("i = %d\n", i);
            soma += i;
            System.out.printf("soma = %d\n", soma);
        }
    }
}
