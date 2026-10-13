package threeWeek.Desafio;

public class Cliente {
    private int idade;
    private String nome;
    private final String cpf;

    public Cliente(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
