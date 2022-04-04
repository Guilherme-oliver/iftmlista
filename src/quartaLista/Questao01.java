package quartaLista;

public class Questao01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Cachorro c2 = new Cachorro();

        System.out.println(cachorro.nome);
        System.out.println(cachorro.idade);
        System.out.println();

        cachorro.late();
        System.out.println();

        System.out.println(cachorro.setInfo("Pikles"));
        System.out.println(cachorro.setInfo(5));
        System.out.println();

        System.out.println(cachorro.setNome("Snorlax"));
        System.out.println(cachorro.setIdade(12));
        System.out.println();

        cachorro.mostraInfo();
        System.out.println();

        System.out.println(c2.nome);
        System.out.println(c2.idade);
        System.out.println();

        c2.late();
        System.out.println();

        System.out.println(c2.setInfo("Plankton"));
        System.out.println(c2.setInfo(2));
        System.out.println();

        System.out.println(c2.setNome("Wargeymon"));
        System.out.println(c2.setIdade(7));
        System.out.println();

        c2.mostraInfo();
    }
}
