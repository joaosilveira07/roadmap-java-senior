package threeWeek.dayOne;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("José", 1998543853);
        Cliente c2 = new Cliente("João", 1295123478);
        Cliente c3 = new Cliente("Marcos", 1199543421);

        /*Uma classe é a definição de algo, um "molde" de alguma coisa, já o objeto é a "definição" deste "molde".
        * Por exemplo: Um Classe Casa define aquilo que uma casa pode ter (atributos) e o que ela pode fazer (métodos),
        * Um objeto casa1 é a instância real daquela Classe
        */

        Carro fusca = new Carro("Fusca", 8300.00);
        Carro palio = new Carro("Palio", 35000.99);

        System.out.println(fusca);
        System.out.println(palio);
    }
}
