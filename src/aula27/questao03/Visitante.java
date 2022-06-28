package aula27.questao03;

import java.util.LinkedList;

public class Visitante {
    private static int contadorTicket = 0;
    private int ticket;
    private int voltas = 0;
    private LinkedList<CarrinhoMR> carrinhoMRS = new LinkedList<>();

    public Visitante(){
    }
    public void entra(CarrinhoMR cmr){
        int posicao = this.carrinhoMRS.indexOf(cmr);
        if (posicao == -1){
            this.carrinhoMRS.add(cmr);
        }else {
            System.out.println("Já possui uma pessoa no carrinho");
        }
    }
    public void sai(){
        if (this.carrinhoMRS.size() > 1){
           this.carrinhoMRS.removeAll(carrinhoMRS);
        }else {
            System.out.println("Não tem mais pessoas no carrinho");
        }
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "ticket=" + ticket +
                ", voltas=" + voltas +
                '}';
    }
}
