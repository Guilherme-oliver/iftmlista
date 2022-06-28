package aula27.questao04;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return "Nome do paciente: "
                + this.nome
                + "\n"
                + "Idade: "
                + idade;
    }
}
