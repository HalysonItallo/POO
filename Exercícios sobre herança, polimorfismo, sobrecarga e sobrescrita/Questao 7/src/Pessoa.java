public class Pessoa {
    private String nome, sobrenome;

    Pessoa(){
        nome = "";
        sobrenome="";
    }

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto(){
        return nome+" "+sobrenome;
    }
}
