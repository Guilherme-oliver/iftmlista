package segundaLista.questao4;

public class Funcionario {
    String nome;
    double salario;
    boolean empregado = false;

    public Funcionario(){

    }

    public Funcionario(String nome, double salario, boolean empregado) {
        this.nome = nome;
        this.salario = salario;
        this.empregado = empregado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean admite(){
        if (!empregado){
            System.out.println("Contratado");
        }else {
            System.out.println("Erro");
        }
        return false;
    }

    public boolean demite(){
        if (!empregado){
            System.out.println("Erro");
        }else {
            System.out.println("Demitido");
        }
        return false;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Empregado: " + this.empregado);
        if (!empregado){
            System.out.println(this.admite());
        }else {
            System.out.println(this.demite());
        }
    }
}
