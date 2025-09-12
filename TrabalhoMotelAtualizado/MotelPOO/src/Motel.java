public class Motel {
    private boolean disponibilidade;
    private String hospede;

    public Motel(boolean disponibilidade, String funcionarios){
        this.disponibilidade = disponibilidade;
        this.hospede = getHospede();

    }

       public void recepcionar(){
           System.out.println("Seja bem vindo(a) ao Motel! " + hospede);

       }
       public void alocarQuartos(){
           System.out.println("Alocando quartos, aguarde.");


       }
       public void higienizacao(){
           System.out.println("Realizando higienização, porfavor aguarde.");
       }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

}
