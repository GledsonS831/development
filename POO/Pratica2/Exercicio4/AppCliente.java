package exercicio4;

public class AppCliente {
    private String nome, endereco;
    private char sexo;

    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setEndereco(String e){
        this.endereco = e;
    }
    public String getEndereco(){return this.endereco;}
    public void setSexo(char s){this.sexo = s;}
    public char getSexo(){return this.sexo;}
    
    public void imprima() {
        String c = "Cliente ";
        c += "\n - Nome: " + this.nome;
        c += "\n - Endereco: " + this.endereco;
        c += "\n - Sexo: " + this.sexo;
        System.out.println(c);
    }
}
