package segundaLista.questao6;

public class Leao {
    String nome = "Clagane";
    int animaiscomidos = 0;
    String nomeaimaiscomidos;

    public Leao(){

    }

    public Leao(String nome, int animaiscomidos, String nomeaimaiscomidos) {
        this.nome = nome;
        this.animaiscomidos = animaiscomidos;
        this.nomeaimaiscomidos = nomeaimaiscomidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String Come(){

        return Come();
    }

    public void MostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Animais comido: " + this.animaiscomidos);
        System.out.println("Nome dos animais comidos: " + this.nomeaimaiscomidos);
    }


}
