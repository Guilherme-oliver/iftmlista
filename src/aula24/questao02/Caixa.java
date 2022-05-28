package aula24.questao02;
//Agregação: Multiplicidade 0..N

public class Caixa {

    private String granja;
    private Ovo[] ovos = new Ovo[12];

    public Caixa(String granja){
        if (granja.length() == 0){
            System.out.println("Invalido!");
        }else {
            this.granja = granja;
        }
    }
    public void addOvo(Ovo o){
        for (int i=0; i<12; i++){
            if (this.ovos[i] == null){
                this.ovos[i] = o;
                break;
            }else if (i == 12){
                System.out.println("Cartela cheia");
            }
        }
    }
    public void removeOvo(){
        for (int i=12; i>=12; i--){
            if (this.ovos[i] != null){
                this.ovos[i] = null;
                break;
            }else if (i ==0){
                System.out.println("Sem ovos");
            }
        }

    }
    public String toString(){
        return "Ovo de granja"
                + granja;
    }
}
