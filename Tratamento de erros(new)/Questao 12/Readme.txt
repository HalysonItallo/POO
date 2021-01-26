No primeiro try ele lança uma exceção do tipo RuntimeException, o catch identifica a exceção lançada
e começa executar o que está dentro dele.
Como dentro catch tem um try que lança também uma exceção do tipo RuntimeException, o catch identifica a exceção lançada
e começa executar o que está dentro dele.
E os dois primeiros comandos de print estão sendo executados dentro dos catchs e o último está dentro da main.
E todos são executados sem a quebra de linha.

Como os erros que são lançados nos try são do tipo RuntimeException e os catchs estão esperando erros do tipo RuntimeException
os catchs sempre serão executados.