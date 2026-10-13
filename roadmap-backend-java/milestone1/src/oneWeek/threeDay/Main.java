package oneWeek.threeDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextInt();

        int maior = n1;
        int menor = n1;
        int media = n3;

        if (n2 > maior){
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        if (n2 < menor){
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        if (n2 < n1){
            if (n1 < n3){
                media = n1;
            }
        }
        if (n3 < n1){
            if (n1 < n2){
                media = n1;
            }
        }

        if (n1 < n2){
            if (n2 < n3){
                media = n2;
            }
        }
        if (n3 < n2){
            if (n2 < n1){
                media = n2;
            }
        }

        System.out.printf("Maior: %d\n", maior);
        System.out.printf("Menor: %d\n", menor);
        System.out.printf("Media: %d\n", media);
    }
}
