package aula27.questao05;

public class Pessoa {
    private String nome;
    private boolean homem;
    private boolean casado;
    private Pessoa pessoa;

   public Pessoa(String nome, boolean homem){
       if (nome.length() == 0){
           System.out.println("Nome invalido!");
       }else {
           this.nome = nome;
       }
       this.homem = homem;
   }

   public boolean ehHomem(){
       if (this.homem == false){
           System.out.println("Não é homem");
           return false;
       }else {
           System.out.println("É homem");
           return true;
       }
   }

    public String getNome() {
        return nome;
    }

    public boolean getCasado() {
        if (casado == true){
            return true;
        }else {
            return false;
        }
    }

    public void casa(Pessoa p){
       if (this.pessoa.homem != pessoa.ehHomem()){
           if (this.pessoa.casado != true){
               System.out.println("Casou");
               this.pessoa.casado = true;
               this.pessoa = p;
           }else {
                 System.out.println("Pessoa já é casada");
               }
       }else {
           System.out.println("Só pode casar se for do sexo diferente: OBS: A questao que pede isso");
       }
    }

    private void aceitaCasamento(Pessoa p){
       if (this.pessoa == null){
           this.pessoa = p;
       }else {
           System.out.println("Erro!");
       }
    }

    public boolean divorcia(){
       if (pessoa.casado == true){
           System.out.println("O cônjuge aceitou o divorcio!");
           this.pessoa.casado = false;
           return false;
       }else {
           System.out.println("Já está separado!");
           return true;
       }
    }

    private void aceitaDivorcio(){

    }

    public String toString(){
       String info = "";
       info += "Nome da pessoa: " + nome + "\n" + "Sexo: " + homem + "\n" + "Estado civil: " + getCasado();
       return info;
    }
}
