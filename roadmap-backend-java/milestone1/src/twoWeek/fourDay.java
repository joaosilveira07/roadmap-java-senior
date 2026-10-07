package twoWeek;

public class fourDay {
    public static void main(String[] args) {
        /*
        8 tipos primitivos:
        int | 4 bytes | -2 bilhoes a 2 bilhoes,
        long | 8 bytes | usado para número realmente extraordinariamente grande, tem que colocar L no final do numero,
        byte | 1 byte | -128 a 127,
        short | 2 bytes | -32768 a 32767,
        float | 4 bytes | precisão simples,
        double | 8 bytes | precisão dupla e é o padrão para decimais,
        char | 2 bytes | armazena um único caractere,
        boolean | 1 bit lógico | true ou false
        */
        int number = 23343242;
        long bigNumber = 1000000000000000000L;
        byte smallNumber = 127;
        short mediumNumber = 32767;
        float numDecimal = 54.34234234F;
        double numDecimalMelhorado = 55.99;
        char caractere = 'a';
        boolean sim = true;
        int teste = (int) numDecimalMelhorado;
        System.out.println("Double: " + numDecimalMelhorado);
        System.out.println("Int: " + teste);
    }
}
