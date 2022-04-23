package lista05.questao05;

public class Funcionario05 {
    private String nome;
    private double salario;
    private double bonificacao;
    private boolean ativo = false;

    public Funcionario05(){

    }

    public Funcionario05(String nome, double salario, double bonificacao) {
        this.nome = nome;
        this.salario = salario;
        this.bonificacao = bonificacao;
    }

    public String toString(){
        return "Nome do funcionario: "
                + nome
                + "\n"
                + "Salario: "
                + salario
                + "\n"
                + "Bonificação: "
                + bonificacao
                + "\n"
                + "Ganho mensal: "
                + calcGanhoMensal()
                + "\n"
                + "Ganho anual: "
                + calcGanhoAnual();
    }
    public void setBonificacao(double porcentagem){
        if (ativo == true){
            this.bonificacao = porcentagem / 100;
        }else {
            System.out.println("Não recebe bonificação");
        }
    }

    public void setSalario(double salario) {
        if (ativo == true){
            this.salario += salario * 10 / 100;
        }else {
            this.salario = salario;
        }
    }

    public void mudaStatus(){
        if (ativo == true){
            System.out.println("Afastando o funcionario: " + nome);
            ativo = false;
        }else {
            System.out.println("Fim do periodo de afastamento do funcionario: " + nome);
            ativo = true;
        }
    }
    public double calcGanhoMensal(){
        if (ativo == true){
            return (salario * bonificacao) + salario;
        }else {
            return salario;
        }

    }
    public double calcGanhoAnual(){
        if (ativo == true){
            return calcGanhoMensal() * 12;
        }else {
            return salario * 12;
        }
    }

}
