package exercicioQuarto;

public class CarroEletrico extends Carro {

  private int potencia;
  private int autonomia;


  public CarroEletrico(String chassi, String motor, double custoProduc, int potencia, int autonomia){
    super(chassi, motor, custoProduc);
    this.potencia = potencia;
    this.autonomia = autonomia;
  }


  @Override 
  public double getPorcentagemImposto(){
    return 0.10;
  }
}
