package quartaLista.questao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        CarrinhoDeSupermercado carrinhoDeSupermercado1 = new CarrinhoDeSupermercado(" ");
        CarrinhoDeSupermercado carrinhoDeSupermercado2 = new CarrinhoDeSupermercado("João");

        carrinhoDeSupermercado2.adicionaProduto("Pera", 5.80);
        carrinhoDeSupermercado2.adicionaProduto("Maçã", 0.20);

        carrinhoDeSupermercado2.mostraInfo();
        carrinhoDeSupermercado2.limpa();
        carrinhoDeSupermercado2.mostraInfo();


        carrinhoDeSupermercado1.mostraInfo();

    }
}
