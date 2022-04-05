package segundaLista.questao2;

public class Questao02 {
    public static void main(String[] args) {

        Retangulo retangulo01 = new Retangulo();
        Retangulo retangulo02 = new Retangulo();

        retangulo01.setLado1(10);
        retangulo01.setLado2(5);
        retangulo01.calculoArea();
        retangulo01.calculoPerimetro();
        retangulo01.mostraInfo();

        retangulo02.setLado1(4);
        retangulo02.setLado2(8);
        retangulo02.calculoArea();
        retangulo02.calculoPerimetro();
        retangulo02.mostraInfo();

    }
}
