package aula27.questao01;

import java.util.LinkedList;

//Associação - 1 para 0..*
public class Arquivo {

    private String nome;
    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
    public String toString(){
        return "Nome: "
                + nome
                + "\n"
                + "Tamanho: "
                + tamanho;
    }
}
