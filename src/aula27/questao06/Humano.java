package aula27.questao06;

import java.util.LinkedList;
// 0..1 0..*
public class Humano {
    private String nome;
    private LinkedList<Cachorro> cachorros = new LinkedList<>();

    public Humano(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void adota(Cachorro c){
        this.cachorros.add(c);
    }
    public String toString(){
        String info = "";
        info += "\nNome da pessoa que está adotando: " + this.nome;
        info += "\nCachorro a ser adotado " + this.cachorros.size() + " Cachorro";
        return info;
    }
}
