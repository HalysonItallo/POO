A saída do código são 1 três vezes, pois a variável op foi inicialiado com 1, um em cada linha do terminal, como por exemplo:
1
1
1

Isso ocorreu, pois em cada case do switch deveria ter um break que faria a saída do bloco de código do switch logo após atender a conidção do case, entretanto
como não teve depois de executar o primeiro case, todos os outros foram ativados até o default.