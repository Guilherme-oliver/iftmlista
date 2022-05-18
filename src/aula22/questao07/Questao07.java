package aula22.questao07;

import java.util.ArrayList;
import java.util.List;

public class Questao07 {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(0, new Pessoa("Joao", 22));
        pessoas.add(1, new Pessoa("Pedro", 20));
        pessoas.add(2, new Pessoa("José", 19));
        pessoas.add(3, new Pessoa("Maria", 23));
        pessoas.add(4, new Pessoa("Estela", 21));

        for (Pessoa x : pessoas){
            System.out.println(x);
        }

        pessoas.add(1, new Pessoa("Karina", 30));
        pessoas.add(3, new Pessoa("Kleber", 50));
        pessoas.add(7, new Pessoa("Guilherme", 29));

        for (Pessoa x : pessoas){
            System.out.println(x);
        }

    }
}
