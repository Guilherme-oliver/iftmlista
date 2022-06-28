package aula27.questao02;

import aula27.questao01.Arquivo;

//Associação – 1 para 0..1
public class Jogador {
    private String nome;
    private Arma arma;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void associaArma(Arma a){
        this.arma = a;
    }

    public String getNome() {
        return nome;
    }
    public void recarrega(int bolas){
        if (arma.estaVazio() == true){
            recarrega(bolas);
        }else {
            System.out.println("Ainda não pode recarregar!");
        }
    }
    public void atira(){
        if (arma.estaVazio() != true){
            System.out.println("Pow!");
            arma.removeBola();
        }else {
            System.out.println("Sem munição");
        }
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", arma=" + arma +
                '}';
    }
}
