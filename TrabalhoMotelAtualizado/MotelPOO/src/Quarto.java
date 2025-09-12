public class Quarto {
    private double valorDiaria;
    private String tipoQuarto;
    private int capacidade;
    private boolean ocupado;
    private double valorHora;

    public Quarto(double valorDiaria, String tipoQuarto, int capacidade){

        this.tipoQuarto = tipoQuarto;
        this.valorDiaria = valorDiaria;
        this.capacidade = capacidade;
        this.ocupado = false;
        this.valorHora = valorDiaria / 24.0;

    }
    public void hospedarCliente(){
        this.ocupado = true;
        System.out.println("Quarto ocupado: " + tipoQuarto);

    }
    public void liberarQuarto(){
        this.ocupado = false;
        System.out.println("Quarto liberado: " + tipoQuarto);
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
        this.valorHora = valorDiaria / 24.0;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

}

