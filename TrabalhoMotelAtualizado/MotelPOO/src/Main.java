//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motel motel = new Motel(true, "tiago sheeran");
        motel.recepcionar();




        Quarto suite1 = new Quarto(100.0, "Suite CLT", 2);
        System.out.println("================================================================");
        System.out.println("Quarto: " + suite1.getTipoQuarto() + " - R$ " + suite1.getValorDiaria() );
        System.out.println("================================================================");

        Quarto suite2 = new Quarto(225.0, "Suite LUXO", 2);
        System.out.println("================================================================");
        System.out.println("Quarto: " + suite2.getTipoQuarto() + " - R$ " + suite2.getValorDiaria() );
        System.out.println("================================================================");

        Quarto suite3 = new Quarto(550.0, "Suite PRESIDENCIAL", 6);
        System.out.println("================================================================");
        System.out.println("Quarto: " + suite3.getTipoQuarto() + " - R$ " + suite3.getValorDiaria() );
        System.out.println("================================================================");
     }


    }
