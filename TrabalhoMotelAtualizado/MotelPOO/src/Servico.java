public class Servico {
    private String refeicao;
    private String acessoriosAdicionais;
    private boolean pernoite;
    private double valor;

    public void Servico(String refeicao, String acessoriosAdicionais, Boolean pernoite, double valor){

        this.acessoriosAdicionais =acessoriosAdicionais;
        this.refeicao = refeicao;
        this.pernoite = pernoite;
        this.valor = valor;

    }
        public void registrarServico(){
            System.out.println("Serviço resgistrado: " + refeicao);
            System.out.println("Serviço resgistrado: " + pernoite);
            System.out.println("Serviço resgistrado: " + acessoriosAdicionais);

        }
        public void atualizarServico(){
            System.out.println("Serviço atualizado");
        }
        public void cancelarServico(){
            System.out.println("Serviço cancelado");

        }

    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }

    public String getAcessoriosAdicionais() {
        return acessoriosAdicionais;
    }

    public void setAcessoriosAdicionais(String acessoriosAdicionais) {
        this.acessoriosAdicionais = acessoriosAdicionais;
    }

    public boolean isPernoite() {
        return pernoite;
    }

    public void setPernoite(boolean pernoite) {
        this.pernoite = pernoite;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}