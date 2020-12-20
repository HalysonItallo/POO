public class TestaMicroblog {
    public static void main(String[] args) {
        Microblog site =  new Microblog(3);
        Postagem p1 = new Postagem(1, "Test1");
        Postagem p2 = new Postagem(2, "Test2");
        Postagem p3 = new Postagem(3, "Test3");

        site.inserirPostagem(p1);
        site.inserirPostagem(p2);
        site.inserirPostagem(p3);

        System.out.println(site.postagems.length);
        System.out.println(site.indice);

       // site.excluir(1);

       site.curtir(1);
       site.curtir(2);
        site.curtir(2); 
        System.out.println(site.maisCurtidas());
    }
}
