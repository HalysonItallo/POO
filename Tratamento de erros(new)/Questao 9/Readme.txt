Exemplo de exceção não checada:
int num1 = 10;
int num2 = 0;
int res = 0;

res = num1 / num2;

Exemplo de opção checada:

FileInputStream FIS = null;
FIS = new FileInputStream("D:/arquivo.txt");

int x;
while ((x = FIS.read()) != 0) {
}

Caso na aplicação bancária a AplicacaoException herde da classe Exception em vez de RuntimeException.
Os métodos deverão receber thows Exception para indicar que aquele metodo pode lançar uma exceção do tipo Exception.