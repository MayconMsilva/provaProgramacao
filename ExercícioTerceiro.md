## Exercício 3

#### 3- Qual o resultado em tela apresentado pelo programa abaixo?

#### int ff( int n)

#### {

#### if (n == 1) return 1;

#### if (n % 2 == 0) return ff( n/2);

#### return ff( (n-1)/2) + ff( (n+1)/2);

#### }

#### void main() {

#### printf( "%d", ff(7));

#### return;

#### }

### O programa chama a função "ff" com o número 7. A função segue três regras: se o número for 1, devolve 1. Se for par, repete a conta com a metade dele. Se for ímpar, repete a conta com o número de baixo e o de cima da metade e soma os dois resultados.

### Seguindo essas regras o programa começa com 7, que é ímpar, então chama ff(3) e ff(4). Então a conta vai ser ff(3) + ff(4).

### ff(3) é ímpar, então chama ff(1) e ff(2). Então a conta vai ser ff(1) + ff(2).

### ff(1) é 1, então devolve 1. ff(2) é par, então chama ff(1), que devolve 1. Então ff(3) = 1 + 1 = 2.

### ff(4) é par, então chama ff(2), que é par, então chama ff(1), que devolve 1. Então ff(4) = 1.

### Então o resultado final é ff(7) = ff(3) + ff(4) = 2 + 1 = 3.

### O RESULTADO FINAL É 3.
