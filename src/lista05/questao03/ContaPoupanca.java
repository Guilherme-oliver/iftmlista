package lista05.questao03;

public class ContaPoupanca {

    private String titular = "José";
    private double saldo = 0.0;

    public ContaPoupanca(){

    }

    public ContaPoupanca(String titular) {
        this.titular = titular;
    }

    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Você ira ficar negativo");
            saldo -= valor;
        }else {
            saldo -= valor;
        }
    }
    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Erro");
        }else {
            saldo += valor;
        }
    }

    public String toString(){
        return "Nome do titular: "
                + titular
                + "\n"
                + "Saldo: "
                + saldo;
    }

}
