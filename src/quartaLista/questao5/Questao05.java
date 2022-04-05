package quartaLista.questao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<CarrinhoDeSupermercado> lista = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Valor: ");
            Double valor = sc.nextDouble();

            CarrinhoDeSupermercado add = new CarrinhoDeSupermercado(nome, valor);
            lista.add(add);
        }




        sc.close();
    }
}
