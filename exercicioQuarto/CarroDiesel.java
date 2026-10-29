package exercicioQuarto;

public class CarroDiesel extends Carro {

  private double capacidadeTanque;
  private double volumeCacamba;

  public CarroDiesel(String chassi, String motor, double custoProduc, double capacidadeTanque, double volumeCacamba){
    super(chassi, motor, custoProduc);
    this.capacidadeTanque = capacidadeTanque;
    this.volumeCacamba = volumeCacamba;
  }  


  @Override 
  public double getPorcentagemImposto(){
    return 0.30;
  }
}
