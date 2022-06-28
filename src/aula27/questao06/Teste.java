package aula27.questao06;

public class Teste {
    public static void main(String[] args) {
        Humano humano1 = new Humano("Pedro");
        Cachorro cachorro1 = new Cachorro("Buzz", "Vira-Lata");
        Humano humano2 = new Humano("José");
        Cachorro cachorro2 = new Cachorro("Woody", "Basset");

        humano1.adota(cachorro2);
        humano2.adota(cachorro1);

        System.out.println("Primeira pessoa: ");
        System.out.println(humano1.toString());
        System.out.println(cachorro2.toString());

        System.out.println("Segunda pessoa: ");
        System.out.println(humano2.toString());
        System.out.println(cachorro1.toString());
    }
}
