package aula27.questao02;
//Associação – 1 para 0..1
public class Arma {
    private String id;
    private int bolas;
    private Jogador jogador;

    public Arma(String id, int bolas) {
        if (id.length() == 0){
            System.out.println("Id Invalido!");
        }else {
            this.id = id;
        }
        if (bolas < 0){
            System.out.println("Valor invalido");
        }else {
            if (bolas == 0){
                System.out.println("Acabou as bolas");
            }else {
                this.bolas = bolas;
            }
        }
    }
    public boolean temJogador(){
        if (this.jogador != null){
            return true;
        }else {
            return false;
        }
    }
    public void associaJogador(Jogador j){
        this.jogador = j;
    }
    public boolean estaVazio(){
        if (this.bolas == 0){
            return true;
        }else {
            return false;
        }
    }
    public void addBolas(int bolas){
        if (bolas > this.bolas || bolas < 0){
            System.out.println("Valor invalido!");
        }else {
            this.bolas += bolas;
        }
    }
    public boolean removeBola(){
        if (this.bolas == 0){
            return false;
        }else {
            bolas--;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Arma{" +
                "id='" + id + '\'' +
                ", bolas=" + bolas +
                ", jogador=" + jogador +
                '}';
    }
}
