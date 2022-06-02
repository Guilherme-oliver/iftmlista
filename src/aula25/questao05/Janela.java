package aula25.questao05;

import java.util.LinkedList;

//Composição: Multiplicidade 1
public class Janela {
    private String titulo;
    private LinkedList<String> itens;

    public Janela(String titulo) {
        if (titulo.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.titulo = titulo;
        }
    }

    public Menu(String titulo, LinkedList<String> itens){
        this.titulo = titulo;
        this.itens = itens;
    }

    public void addItemMenu(String item){
        this.itens.add(item);
    }
    public void removeItemMenu(){
        this.itens.removeFirst();
    }
    public String toString(){
        return "Titulo: "
                + titulo
                + "\n"
                + "Itens: "
                + itens;
    }
}
