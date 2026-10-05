package oneWeek.twoDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // EX 1
        int n1;
        n1 = sc.nextInt();
        if (n1 % 2 == 0){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}
