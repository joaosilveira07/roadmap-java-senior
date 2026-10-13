package threeWeek.Desafio;

public class ContaPoupanca extends ContaBancaria{
    private double saldo;

    public ContaPoupanca(Cliente titular, String agencia, String numero, double saldo) {
        super(titular, agencia, numero);
        this.saldo = saldo;
    }
}
