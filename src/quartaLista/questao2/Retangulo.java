package quartaLista.questao2;

public class Retangulo {
    int lado1;
    int lado2;

    Retangulo(){
        lado1 = 20;
        lado2 = 13;
    }

    public Retangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    void setLados(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    int calcArea(){
        return lado1 * lado2;
    }
    int calcPerimetro(){
        return 2*(lado1 + lado1);
    }
    boolean ehQuadrado(){
        if (lado1 == lado2){
            System.out.println("É quadrado");
        }
        if (lado1 != lado2){
            System.out.println("Não é quadrado");
        }
        return true;
    }
    void mostraInfo(){
        System.out.println(lado1);
        System.out.println(lado2);
        System.out.println(calcPerimetro());
        System.out.println(calcArea());
        System.out.println(ehQuadrado());
    }
}
