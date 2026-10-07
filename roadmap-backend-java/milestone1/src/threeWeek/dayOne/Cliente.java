package threeWeek.dayOne;

public class Cliente {
    private double saldo;
    private String nome;
    private int numero;

    public Cliente(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
