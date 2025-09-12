public class Usuario {
    private String cadastro;
    private double formaPagamento;


    public void Usuario(String cadastro, double formaPagamento){

        this.cadastro = cadastro;
        this.formaPagamento = formaPagamento;

    }

    public void cadastrarHospede(){
        System.out.println("Hóspede Cadastrado: " + cadastro);
    }
    public void deletarHospede(){
        System.out.println("Sua conta foi excluida " + cadastro);
    }
    public void buscarHospede(){
        System.out.println("Buscando hóspede: "+ cadastro);
    }
}
