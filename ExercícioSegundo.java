public class ExercícioSegundo {
  
  public static void main(String [] args){
    int[][] matriz = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    int resultado = quantidadeOcorrencias(matriz, 3, 3);
    System.out.println("O maior número de ocorrências é: " + resultado);
  }


  public static int quantidadeOcorrencias(int[][] matriz, int linhas, int colunas){
    int pares = 0;
    int impares = 0;


    for (int i = 0; i < linhas; i++){
      for (int j = 0; j < colunas; j++){
        if(matriz[i][j] % 2 == 0){
          pares++;
        }else{
          impares++;
        }
      }
    }
    return Math.max(pares, impares);
  }

  
}
