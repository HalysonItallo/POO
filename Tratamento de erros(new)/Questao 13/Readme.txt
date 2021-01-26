a)
Alternativa 1 - O ponto é deixar ao acaso o error, ou seja a gente como desenvolvedor precisa ter o máximo controle
do que a nossa aplicação está fazendo.

Alternativa 2 - Além de muitas vezes precisarmos de muitos ifs/elses para desenvolver um controle sobre uma aplicação complexa,
ainda podemos deixar algum tipo de lógica que quebra a aplicação. Além de ter que printar os erros ou operações negadas e não
observamos o propty, em caso de aplicações com inteface gráfica.

Alternativa 3 - Nessa alternativa temos diversos problemas, pois precisamos testar o valor de retorno para saber o que houve, assim
utilizando-se de vários ifs/elses. Já quando o método retorna um valor precisamos ter que crirar uma tabela para cada tipo de
valor criado, além de precisarmos de if/elses para exibir tal mensagem de error.

b)
Com o uso das exceções deixamos a nossas aplicações mais robustas, ou seja, elas conseguem lidar com deteminados erros da aplicação sem
que ela precise parar de executar, assim tornando-se um aplicação mais instável.

c)
Por que quando lançamos uma exceção não precisamos fazer com que aquele determinado método retorne algo, assim o método que está
chamando aquele outor método vai receber a excessão, assim não parando a aplicação.

Na própria aplicação do Banco temos que antes tinhamos que a cada método que precisasse do método consultar precisaria do
if(consultar(numero)!=-1) para que a aplicação não desse um erro e parasse, entranto com a implementação das exceções foi possível
retirar todos os ifs que faziam esse papel na nossão implementação da classe Banco.