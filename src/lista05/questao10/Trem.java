package lista05.questao10;

public class Trem {
    private String nome;
    private int estacaoatual = 0;
    private int estacaofinal;
    private int cabines;
    private int pessoas;
    private boolean indo = true;

    public Trem() {

    }

    public Trem(String nome, int estacaofinal, int cabines) {
        this.nome = nome;
        this.estacaofinal = estacaofinal;
        this.cabines = cabines;
    }

    private String infoEstacao(int estacao) {
        if (estacao == 0) {
            return estacao + " - Luz";
        } else if (estacao == 1) {
            return estacao + " - Prefeitura";
        } else if (estacao == 2) {
            return estacao + " - Moema";
        } else if (estacao == 3) {
            return estacao + " - Barra";
        } else if (estacao == 4) {
            return estacao + " - Copacabana";
        } else {
            return "Invalido";
        }

    }

    private String infoCap() {
        return String.valueOf(cabines * pessoas);
    }

    public String toString() {
        return "Nome do trem: "
                + nome
                + "\n"
                + "Estação: "
                + estacaoatual
                + "\n"
                + "Quantidade de cabines no trem: "
                + cabines
                + "\n"
                + "Número de pessoas"
                + pessoas;
    }

    public void entra() {
        pessoas = pessoas + 1;
        System.out.println("Uma pessoa entrou no trem " + "\n" + "Quantidade de pessoas: " + pessoas + "\n" + "Quantidade de cabines: " + cabines + "\n" + "Capacidade do trem: " + infoCap());
    }

    public void sai() {
        pessoas = pessoas - 1;
        System.out.println("Uma pessoa entrou no trem " + "\n" + "Quantidade de pessoas: " + pessoas + "\n" + "Quantidade de cabines: " + cabines + "\n" + "Capacidade do trem: " + infoCap());
    }

    private void trocaSentido() {
        if (indo) {
            indo = false;
        } else {
            indo = true;
        }
    }

    public void avancaEstacao() {

        System.out.println(infoEstacao(estacaoatual));

        if (estacaoatual == estacaofinal) {
            trocaSentido();
        }
        if (indo) {
            estacaoatual++;
        } else {
            estacaoatual--;
        }
        System.out.println("Chegou em" + infoEstacao(estacaoatual));

    }

    public void avancaEstacao(int estacao) {
       if (indo && estacao < estacaofinal){
          do {
              avancaEstacao();
          }while (estacao < estacaofinal);
       }else if (!indo || estacao >= estacaofinal){
           System.out.println("O trem não pode ficar na mesma estação ou voltar");
       }else if (!indo && estacao < estacaofinal){
           do {
               avancaEstacao();
           }while (estacao >=0);
       }

    }


}
