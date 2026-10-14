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
        this.saldo = 0;
    }

    public boolean sacar(double valor){
        if (valor <= this.saldo && valor >= 1){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposito(double valor){
        if (valor >= 1) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
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

    public Cliente getTitular() {
        return titular;
    }


}
