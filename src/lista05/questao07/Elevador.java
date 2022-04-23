package lista05.questao07;

public class Elevador {
    private int andarAtual = 0;
    private int andares;
    private int subsolo;
    private int capacidade;
    private int pessoas = 0;

    public Elevador(){

    }

    public Elevador(int andares, int subsolo, int capacidade) {
        this.andares = andares;
        this.subsolo = subsolo;
        this.capacidade = capacidade;
    }

    private String getAndar(){
       return "Elevador está " + andarAtual ;
    }
    public String toString(){
        return "Andar atual"
                + andarAtual
                + "\n"
                + "Pessoas dentro do elevador: "
                + pessoas
                + "\n"
                + "Capacidade total do elevador: "
                + capacidade;
    }
    public void entra(){
        if (capacidade < 0){
            System.out.println("Erro de leitura");
        }
        else if (capacidade == pessoas){
            System.out.println("Capacidade maxima atingida, número de pessoas:" + pessoas);
        }else {
            pessoas = pessoas + 1;
            System.out.println("Quantidade de pessoas atual:" + pessoas);
        }
    }
    public void entra(int pessoas){
        if (capacidade < 0){
            System.out.println("Erro de leitura");
        }
        else if (capacidade == this.pessoas){
            System.out.println("Capacidade maxima atingida, número de pessoas:" + this.capacidade);
        }else {
            this.pessoas += pessoas;
            System.out.println("Quantidade de pessoas atual:" + this.pessoas);
        }
    }
    public void sai(){
        if (capacidade <= pessoas){
            pessoas = pessoas - 1;
        }else if (capacidade < 0){
            System.out.println("Erro de leitura");
        }
    }
    public void sai(int pessoas){
        if (capacidade <= this.pessoas){
            this.pessoas -= pessoas;
        }else if (capacidade < 0){
            System.out.println("Erro de leitura");
        }
    }
    public void sobe(){
        if (andarAtual == 0){
            System.out.println("Terro");
            andarAtual += 1;
            System.out.println("Subindo para " + andarAtual + "o. andar");
        }else if (andarAtual <= andares && andarAtual > 0){
            System.out.println(andarAtual + "o. andar");
            andarAtual += 1;
            System.out.println("Subindo para " + andarAtual + "o. andar");
        }else if (andarAtual < 0){
            System.out.println("Subsolo" + andarAtual);
        }

    }
    public void desce(){
        if (andarAtual == 0){
            System.out.println("Terro");
            andarAtual -= 1;
            System.out.println("Descendo para o subsolo " + andarAtual);
        }else if (andarAtual <= andares && andarAtual > 0){
            System.out.println(andarAtual + "o. andar");
            andarAtual -= 1;
            System.out.println("Descendo para " + andarAtual + "o. andar");
        }else if (andarAtual > 0 && andarAtual > subsolo){
            System.out.println("Subsolo" + andarAtual);
            System.out.println("Descendo para o subsolo " + andarAtual);
        }
    }
    public void mudaAndar(int andar){
        if (andarAtual == 0){
            System.out.println("Terro");
            andarAtual += andar;
            System.out.println("Subindo para " + andarAtual + "o. andar");
        }else if (andarAtual <= andares && andarAtual > 0){
            System.out.println(andarAtual + "o. andar");
            andarAtual += andar;
            System.out.println("Subindo para " + andarAtual + "o. andar");
        }else if (andarAtual == subsolo){
            System.out.println("Subsolo" + andarAtual);
            andarAtual += andar;
            System.out.println("Subindo para " + andarAtual + "o. andar");
        }

        if (andarAtual == 0){
            System.out.println("Terro");
            andarAtual -= andar;
            System.out.println("Descendo para o subsolo " + andarAtual);
        }else if (andarAtual <= andares && andarAtual > 0){
            System.out.println(andarAtual + "o. andar");
            andarAtual -= andar;
            System.out.println("Descendo para " + andarAtual + "o. andar");
        }else if (andarAtual < 0 && andarAtual >= subsolo){
            System.out.println("Subsolo" + andarAtual);
            System.out.println("Descendo para o subsolo " + andarAtual);
        }
    }

}
