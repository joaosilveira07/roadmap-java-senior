package twoWeek;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double areaC, raioC;
        raioC = sc.nextDouble();
        areaC = (raioC * raioC) * 3.14;
        System.out.printf("área do circulo: %.2fcm2\n", areaC);

        double areaR, baseR, alturaR;
        baseR = sc.nextDouble();
        alturaR = sc.nextDouble();
        areaR = baseR * alturaR;
        System.out.printf("área do retangulo: %.2fcm2\n", areaR);
    }
}
