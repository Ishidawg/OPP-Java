package br.unipar.objetos;

public class PessoaEncapsulada {

    // Todos os atributos como privados

    private String nome;
    private String time;

    // Getter (sempre vai ser public ou protected)

    public String getNome() {
        return nome;
    }

    public String getTime() {
        return time;
    }

    // Setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
