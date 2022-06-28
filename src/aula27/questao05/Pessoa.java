package aula27.questao05;

public class Pessoa {
    private String nome;
    private boolean homem;

    public Pessoa(String nome, boolean homem) {
        this.nome = nome;
        this.homem = homem;
    }

    public boolean ehHomem(){
        if (this.homem == true){
            return true;
        }else {
            return false;
        }
    }
    public String getNome(){
        return this.nome;
    }
    public boolean getCasado(){
        if (getCasado() == true){
            return true;
        }else {
            return false;
        }
    }
    public void casa(Pessoa p){
        if (p.nome != this.nome){
            if (p.homem != this.homem){
                if (getCasado() == false){
                    System.out.println("Casal casou");

                }
            }
        }
    }
    private void aceitaCasamento(Pessoa p){

    }
    public boolean divorcia(){
        return false;
    }
    private void aceitaDivorcio(){

    }
    public String toString(){
        return "Nome: "
                + nome
                + "\n"
                + "Sexo: "
                + homem;
    }

}
