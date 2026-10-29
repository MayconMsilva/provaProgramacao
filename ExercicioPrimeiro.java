import java.util.Scanner;

public class ExercicioPrimeiro {

  public static long calculoPosicao(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    long penultimo = 0;
    long ultimo = 1;
    long atual = 0;

    for (int i =2; i <= n; i++){
      atual = penultimo + ultimo;
      penultimo = ultimo;
      ultimo = atual;
    }

    return atual;
  }



  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a posição da sequência de Fibonacci que você deseja: ");
    int posicao = scanner.nextInt();

    if(posicao < 0){
      System.out.println("Número Não Aceito, tem que ser maior que 0");
    }else{
      long resultado = calculoPosicao(posicao);
      System.out.println("O número de Fibonacci na posição " + posicao + "é: " + resultado);
    }

    scanner.close();
  }





}
