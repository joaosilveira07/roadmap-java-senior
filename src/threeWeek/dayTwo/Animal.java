package threeWeek.dayTwo;

public abstract class Animal {
    private String nome;

    public Animal (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public abstract void emitirSom();
}
