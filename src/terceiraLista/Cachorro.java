package terceiraLista;

public class Cachorro {
    String nome = "Totó";
    int idade = 5;

    String late(){
        return "au au";
    }
    String late(String latido){
        return latido;
    }
    String late(int vezes){
        return "Latiu " + vezes + " vezes " + late() ;
    }
    String late(int vezes, String latido){
        return "Latiu " + vezes  + " x"+ " auuuuuu " + latido ;
    }
    String setInfo(String n){
        return nome = n;
    }
    int setInfo(int i){
        return idade = i;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    String mostraInfo(){
        return "Nome: " + nome + " ,idade: " + idade;
    }

}
