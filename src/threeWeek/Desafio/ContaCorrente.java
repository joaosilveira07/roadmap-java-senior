package threeWeek.Desafio;

public class ContaCorrente extends ContaBancaria{
    private double saldo;

    public ContaCorrente(Cliente titular, String agencia, String numero){
        super(titular, agencia, numero);
        this.saldo = 0;
    }

}
