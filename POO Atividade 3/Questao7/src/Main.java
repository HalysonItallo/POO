public class Main {
    public static void main(String[] args) {
        int[] inteiros = new int[args.length];


        for(int i = 0; i < args.length; i++){
            inteiros[i] = Integer.parseInt(args[i]);
        }

        int i = 0, j = 0, aux = 0, menor;
        for(i = 0; i < inteiros.length; i++){
            menor = i;
            for (j = i + 1; j < inteiros.length; j++){
                if (inteiros[j] < inteiros[menor]){
                    menor = j;
                }
            }
            aux = inteiros[i];
            inteiros[i] = inteiros[menor];
            inteiros[menor] = aux;
        }
        for(int numero: inteiros){
            System.out.println(numero);
        }
    }
}
