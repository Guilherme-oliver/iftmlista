package lista05.questao06;

public class Televisao {
    private boolean ligado = false;
    private int volMin = 0;
    private int volMax;
    private int volAtual = 0;
    private int canalMin = 2;
    private int canalMax;
    private int canalAtual = 2;

    public Televisao(){

    }

    public Televisao(int volMax, int canalMax) {
        this.volMax = volMax;
        this.canalMax = canalMax;
    }
    public String toString(){
        if (ligado == true){
            return "A televisão está ligada"
                    + "\n"
                    + "O volume atual é: "
                    + volAtual
                    + "\n"
                    + "O canal atual é: "
                    + canalAtual;
        }else {
            return "Está desligada";
        }

    }
    public void ligaDesliga(){
        if (ligado == false){
            ligado = true;
        }else {
            ligado = false;
        }
    }
    public void aumentaVolume(){
        if (volAtual == 100){
            System.out.println("Volume maximo: " + volMax);
        }else if (volAtual >= 0){
            volAtual = volAtual + 1;
        }
    }
    public void diminuiVolume(){
        if (volAtual == 0){
            System.out.println("Volume minimo: " + volMin);
        }else if (volAtual <= 100){
            volAtual = volAtual - 1;
        }
    }
    public void aumentaCanal(){
        if (canalAtual >= canalMin){
            canalAtual = canalAtual + 1;
        }else if (canalAtual == canalMax){
            canalAtual = canalMin;
        }
    }
    public void diminuiCanal(){
        if (canalAtual == canalMin){
            canalAtual = canalMax;
        }else if (canalAtual == canalMax){
            canalAtual = canalMax - 1;
        }else {
            canalAtual = canalAtual - 1;
        }
    }
    public void setCanal(int canal){
        if (canalAtual >= canalMin && canalAtual <= canalMax){
           this.canalAtual = canal;
           aumentaCanal();
        }else {
            System.out.println("Canal fora de frequencia");
        }
    }
}
