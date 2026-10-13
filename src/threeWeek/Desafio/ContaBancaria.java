package threeWeek.Desafio;

public abstract class ContaBancaria {
    private double saldo;
    private String numero;
    private String agencia;
    private Cliente titular;

    public ContaBancaria(Cliente titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }
}
