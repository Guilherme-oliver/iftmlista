package lista05;

public class Cachorro {

    private String nome = "Bob";
    private int idade = 3;

    public Cachorro(){

    }
    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    private void late(){
        System.out.println("au au");
    }
    public void come(){
        System.out.println("Cachorro comeu ração");
        late();
    }
    public void brinca(){
        System.out.println("Cachorro brincou com o brinquedo");
        late();
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String toString(){
        return "Nome do cachorro: "
                + nome
                + "\n"
                + "Idade do cachorro: "
                + idade;
    }
}
