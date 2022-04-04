package terceiraLista;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro01 = new Cachorro();
        Cachorro cachorro02 = new Cachorro();

        System.out.println(cachorro01.late());
        System.out.println(cachorro02.late());
        System.out.println();

        System.out.println(cachorro01.late("latido"));
        System.out.println(cachorro02.late("latido"));
        System.out.println();

        System.out.println(cachorro01.late(3));
        System.out.println(cachorro02.late(1));
        System.out.println();

        System.out.println(cachorro01.late(4, "latidos"));
        System.out.println(cachorro02.late(5, "latidos"));
        System.out.println();

        cachorro01.setInfo("Bilu");
        cachorro02.setInfo("Chacau");
        System.out.println(cachorro01.nome);
        System.out.println(cachorro02.nome);
        System.out.println();

        cachorro01.setInfo(3);
        cachorro02.setInfo(2);
        System.out.println(cachorro01.idade);
        System.out.println(cachorro02.idade);
        System.out.println();

        cachorro01.setNome("Pedro");
        cachorro01.setIdade(10);
        cachorro02.setNome("João");
        cachorro02.setIdade(12);
        System.out.println(cachorro01.idade);
        System.out.println(cachorro01.nome);
        System.out.println(cachorro02.idade);
        System.out.println(cachorro02.nome);
        System.out.println();

        System.out.println(cachorro01.mostraInfo());
        System.out.println(cachorro02.mostraInfo());

    }
}
