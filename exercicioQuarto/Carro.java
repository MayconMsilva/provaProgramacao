package exercicioQuarto;

public abstract class Carro {

  private String chassi;
  private String motor;
  private double custoProduc;

  public Carro(String chassi, String motor, double custoProduc){
    this.chassi = chassi;
    this.motor = motor;
    this.custoProduc = custoProduc;
  }

  public abstract double getPorcentagemImposto();


  public double calcularVendaCusto(){
    double imposto = this.custoProduc * this.getPorcentagemImposto();
    double lucro = this.custoProduc * 0.25;


    return this.custoProduc + imposto + lucro;
  }


  public String getChassi(){return chassi;}
  public String getMotor(){return motor;}
  public double getCustoProduc(){return custoProduc;}
  
}
