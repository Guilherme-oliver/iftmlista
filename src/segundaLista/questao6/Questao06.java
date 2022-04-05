package segundaLista.questao6;

public class Questao06 {
    public static void main(String[] args) {
        Leao leao1 = new Leao();

        leao1.MostraInfo();
        System.out.println();

        leao1.setNome("Coragem");
        leao1.setAnimaiscomidos(4);
        for (int i = 0; i < leao1.animaiscomidos; i++){
            leao1.come("Zebra");
            leao1.come("Javali");
            leao1.come("Coiote");
            leao1.come("Bufalo");
        }


    }
}
