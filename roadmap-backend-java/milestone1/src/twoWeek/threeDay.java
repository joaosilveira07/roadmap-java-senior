package twoWeek;

import java.util.Scanner;

public class threeDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome1 = "João Pedro", curso1 = "Engenharia de Software";
        String nome2, curso2;
        System.out.println("Hello World!");
        System.out.printf("Meu nome é %s\nEstudante de %s\n", nome1, curso1);
        System.out.println("Qual seu nome? ");
        nome2 = sc.nextLine();
        System.out.println("Qual seu curso? ");
        curso2 = sc.nextLine();
        System.out.printf("Prazer, %s!\nO que está achando do curso de %s?\n", nome2, curso2);
    }
}
