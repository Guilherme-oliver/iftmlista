package quartaLista.questao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeSupermercado {
    String dono;
    Double produtos = 0.0;
    String lista = "";
    double valorcomprado = 0.0;
    Scanner scanner = new Scanner(System.in);

    CarrinhoDeSupermercado(String nome, Double valor){

    }

    public CarrinhoDeSupermercado(String dono, Double produtos, String lista, double valorcomprado) {
        this.dono = dono;
        this.produtos = produtos;
        this.lista = lista;
        this.valorcomprado = valorcomprado;
    }

    public void adicionaProduto(String nome, Double valor){
        lista = nome;
        produtos = valor;
    }
    public void limpa(){
        List<String> lista = new ArrayList<>();
        lista.removeAll(lista);
    }
    void mostraInfo(){
        System.out.println(dono);
        System.out.println(produtos);
        System.out.println(lista);
        System.out.println(valorcomprado);


    }
}
