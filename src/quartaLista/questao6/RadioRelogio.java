package quartaLista.questao6;

public class RadioRelogio {
    int horas;
    int minutos;
    int estacao;
    boolean ligado = false;

    RadioRelogio(){

    }

    public RadioRelogio(int horas, int minutos, int estacao, boolean ligado) {
        this.horas = horas;
        this.minutos = minutos;
        this.estacao = estacao;
        this.ligado = ligado;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getEstacao() {
        return estacao;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setEstacao(int estacao) {
        this.estacao = estacao;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    void avancaHora(){
        horas = 0;
        int horasAtual = 24;
        if (horasAtual == 24){
            horas = horasAtual - 24 + 1;
        }else {
            horas += horas + 1;
        }

    }
    void avancaMinuto(){
        minutos = 0;
        int minutosAtual = 24;
        if (minutosAtual == 59){
            minutos = minutosAtual -59 + 1;
        }else {
            minutos += minutos + 1;
        }
    }

    void liga(){
       if (ligado == false){
           System.out.println("Está desligado");
           System.out.println("Ligando...");
           ligado = true;
       }else {
           System.out.println("Já está ligado");
       }
    }
    void desliga(){
        if (ligado == true){
            System.out.println("Está ligado");
            System.out.println("Desligando...");
            ligado = false;
        }else {
            System.out.println("Já está desligado");
        }
    }
    void trocaEstacao(int estacao){
        this.estacao = estacao ;
        int estacaoAtual = 108;
        if (estacaoAtual > 108){
            System.out.println("ZZZZzzzzzZZZZ");
        }else if (estacaoAtual < 87){
            System.out.println("ZZZZzzzzzZZZZ");
        }else {
            System.out.println("Você está na estação " + estacao);
        }
    }
    void mostraInfo(){
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println(estacao);
        if (ligado == false){
            liga();
        }else {
            desliga();
        }
    }
}
