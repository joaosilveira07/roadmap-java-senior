package threeWeek.Desafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
