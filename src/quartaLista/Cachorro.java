package quartaLista;

public class Cachorro {
    String nome;
    int idade;

    public Cachorro(){
        nome = "Plankton";
        idade = 99999;
    }

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public Cachorro(int idade) {
        this.idade = idade;
    }

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    boolean late(){
        System.out.println("Au au");
        return true;
    }
    int setInfo(int i){
        this.idade = i;
        return i;
    }
    String setInfo(String n){
        return this.nome = n;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    void mostraInfo(){
        System.out.println("Informações");
        System.out.println(nome);
        System.out.println(idade);
        late();

    }
}
