package questao6;

public class Programa06 {
    public static void main(String[] args) {

        RadioRelogio radioRelogio1 = new RadioRelogio();
        RadioRelogio radioRelogio2 = new RadioRelogio();

        radioRelogio1.getHoras();
        radioRelogio1.getMinutos();
        radioRelogio1.getEstacao();
        radioRelogio1.mostraInfo();
        System.out.println();

        radioRelogio2.setLigado(true);
        radioRelogio2.setHoras(24);
        radioRelogio2.avancaHora();
        radioRelogio2.setMinutos(59);
        radioRelogio2.avancaMinuto();
        radioRelogio2.trocaEstacao(108);
        radioRelogio2.mostraInfo();

    }
}
