package aula27.questao06;
// 0..1 0..*
public class Cachorro {
    private String nome;
    private String raca;
    private Humano humano;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    public boolean temDono(){
        if (this.humano == null){
            return false;
        }elsZe {
            return true;
        }
    }
    public void associaHumano(Humano h){
        this.humano.adota(this);
    }
    public String toString(){
        return "Nome do cachorro: "
                + this.nome
                + "\n"
                + "Raça do cachorro: "
                + raca
                + "\n"
                + "Tem dono: "
                + temDono();
    }
}
