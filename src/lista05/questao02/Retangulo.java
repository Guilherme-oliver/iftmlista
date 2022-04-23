package lista05.questao02;

public class Retangulo {
    private int lado1, lado2;

    public Retangulo(){

    }

    public Retangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public void setLados(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    private int calcArea(){
        return lado1 * lado2;
    }
    private int calcPerimetro(){
        return 2 * (lado1 + lado2);
    }
    private boolean ehQuadrado(){
        if (lado1 == lado2){
            System.out.println("É quadrado");
            return true;
        }
        if (lado1 != lado2){
            System.out.println("Não é quadrado");
            return false;
        }
        return ehQuadrado();

    }
    public String toString(){
        return "Lado 01: "
                + lado1
                + "\n"
                + "Lado 02: "
                + lado2
                + "\n"
                + "Area: "
                + calcArea()
                + "\n"
                + "Perimetro: "
                + calcPerimetro()
                + "\n"
                + "É quadrado? "
                + ehQuadrado();
    }


}
