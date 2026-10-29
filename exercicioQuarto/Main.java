package exercicioQuarto;

public class Main {

  public static void main(String[] args){

    CarroFlex flex = new CarroFlex("FLEX123", "1.6 Flex", 50000.0, 4, 1.6);
    CarroDiesel diesel = new CarroDiesel("DIE123", "3.0 Turbo", 50000.0, 1000.0, 1200.0);
    CarroEletrico eletrico = new CarroEletrico("ELE123", "Elétrico 150kW", 50000.0, 200, 360);


    System.out.println("FLEX: " + flex.calcularVendaCusto());
    System.out.println("DIESEL: " + diesel.calcularVendaCusto());
    System.out.println("ELETRICO: " + eletrico.calcularVendaCusto());
  }


  
}
