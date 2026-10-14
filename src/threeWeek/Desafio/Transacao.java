package threeWeek.Desafio;

import java.time.LocalDate;

public class Transacao {
    private String tipo;
    private LocalDate data;
    private double valor;
    private ContaBancaria conta;

    public Transacao(int tipo, double valor, ContaBancaria conta){
        if (tipo == 1){
            this.tipo = "Depósito";
        } else if (tipo == 2){
            this.tipo = "Saque";
        } else{
            throw new IllegalArgumentException("O tipo da transação deve ser 1 ou 2.");
        }

        this.valor = valor;
        this.conta = conta;
        this.data = LocalDate.now();

        if (this.tipo.equalsIgnoreCase("depósito")){
            realizarDeposito(this.valor);
        } else {
            realizarSaque(this.valor);
        }
    }

    public void realizarDeposito(double valor){
        boolean sucesso = conta.deposito(valor);
        if (sucesso){
            System.out.println("Depósito realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

    public void realizarSaque(double valor){
        boolean sucesso = conta.sacar(valor);
        if (sucesso){
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }
}
