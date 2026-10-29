package exercicioQuarto;

public class CarroFlex extends Carro {

  private int numeroPortas;
  private double cilindradas;

  public CarroFlex(String chassi, String motor, double custoProduc, int numeroPortas, double cilindradas){
    super(chassi, motor, custoProduc);
    this.numeroPortas = numeroPortas;
    this.cilindradas = cilindradas;
  }


  @Override 
  public double getPorcentagemImposto(){
    return 0.20;
  }
  
}
