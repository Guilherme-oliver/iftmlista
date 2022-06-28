package aula27.questao03;

import java.util.LinkedList;

public class CarrinhoMR {
    private String id;
    private LinkedList<Visitante> visitantes = new LinkedList<>();

    public CarrinhoMR(String id) {
        this.id = id;
    }
    public boolean associaOcupante(Visitante v){
        if (visitantes == null){
            visitantes.add(v);
            return true;
        }else {
            return false;
        }
    }
    public void daVolta(){
        if (visitantes.contains(visitantes)){
            System.out.println("Carrinho está dando uma volta");
            this.visitantes.removeAll(this.visitantes);
        }else {
            System.out.println("Carrinho não pode dar uma volta");
        }
    }
}
