package quartaLista.questao5;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeSupermercado {
    String dono;
    int produtos = 0;
    String lista = "";
    double valorcomprado = 0.0;

    CarrinhoDeSupermercado(){

    }

    public CarrinhoDeSupermercado(String dono, int produtos, String lista, double valorcomprado) {
        this.dono = dono;
        this.produtos = produtos;
        this.lista = lista;
        this.valorcomprado = valorcomprado;
    }

    public void adicionaProduto(String nome, Double valor){


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
