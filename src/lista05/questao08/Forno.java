package lista05.questao08;

public class Forno {

    private boolean ligado = false;
    private boolean aberto;
    private int capacidade;
    private int paes = 0;
    private boolean assados = false;

    public Forno(){

    }

    public Forno(boolean aberto, int capacidade) {
        this.aberto = aberto;
        this.capacidade = capacidade;
    }

    public String toString(){
        return "O forno está ligado: "
                + ligado
                + "\n"
                + "O forno está aberto: "
                + aberto
                + "\n"
                + "Capacidade do forno: "
                + capacidade
                + "\n"
                + "Quantos pães estão no forno: "
                + paes
                + "\n"
                + "Os pães estão assados: "
                + assados;
    }

    public void liga(){
        if (aberto == true || capacidade == 0 || assados == true || paes == 0 || capacidade < paes){
            System.out.println("O forno não pode ser ligado");
        }else if (aberto == false || paes <= capacidade || paes >= 1 || assados == false){
            System.out.println("O forno pode ser ligado");
            ligado = true;
            System.out.println("Forno foi ligado");
        }
    }
    public void desliga(){
        ligado = false;
        if (ligado == false){
            assados = true;
            System.out.println("Os pães estão assados");
        }
    }
    public void abrePorta(){
        aberto = true;
        if (aberto == true && ligado == true){
            System.out.println("O padeiro se queimou!");
        }else if (aberto == true && assados == false){
            System.out.println("Os pães não estão assados");
        }
    }
    public void fechaPorta(){
        aberto = false;
    }
    public void colocaPao(){
        if (paes <= capacidade && assados == true){
            System.out.println("Não pode colocar pães crus junto com assados!");
        }else if (ligado == true && assados == true){
            System.out.println("O padeiro se queimou");
        }else if (ligado == false && assados == false){
            System.out.println("Colocando os pães para assar!");

        }
    }

    public void retiraPao(){
        if (assados == true && ligado == false && aberto == true){
            System.out.println("Os pães são retirados");
            paes = paes - 1 ;
            assados = false;
        }else {
            System.out.println("Os pães não podem ser retirados!");
        }
    }

    public void retiraPao(int paes){
        this.paes = paes;
        retiraPao(2);
    }

    public void descarrega(){
        retiraPao(capacidade);
    }
}
