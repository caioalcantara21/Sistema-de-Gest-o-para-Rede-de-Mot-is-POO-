import java.util.Date;

public class Reserva {
    private Date dataEntrada;
    private Date dataSaida;
    private int totalEstadia;
    private Quarto quarto;
    private Usuario usuario;

    public void reserva(Date dataEntrada, Date dataSaida, Quarto quarto, Usuario usuario){
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.usuario = usuario;
        calcularEstadia();

    }
        private void calcularEstadia(){
            long diferencaDia = dataSaida.getTime() - dataEntrada.getTime();
            this.totalEstadia = (int) (diferencaDia / (1000 * 60 * 60));
        }



        public void reservarSuite(){
            if (!quarto.isOcupado()){
                quarto.hospedarCliente();
                System.out.println("Reserva realizada!");
                System.out.println("Tempo de reserva:" + totalEstadia + "horas");
            }else {
                System.out.println("Quarto indisponível para reserva!");
            }
        }
        public void verificarDisponibilidade(){
            System.out.println("Quarto " + quarto.getTipoQuarto() + "Disponivel" + !quarto.isOcupado());

    }
    public void controleReservas(){
        System.out.println("Reserva ok !");

    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getTotalEstadia() {
        return totalEstadia;
    }

    public void setTotalEstadia(int totalEstadia) {
        this.totalEstadia = totalEstadia;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public double getValorTotal(){
        return totalEstadia * (quarto.getValorDiaria() / 24.0);
    }
    public double getValorPorHora(){
        return quarto.getValorDiaria() / 24.0;
    }

}
