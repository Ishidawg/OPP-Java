package br.unipar.main;

import br.unipar.objetos.PessoaEncapsulada;

public class MainEncapsulado {
    public static void main(String[] args) {
        PessoaEncapsulada pessoa = new PessoaEncapsulada();


        pessoa.setNome("Willy");
        pessoa.setTime("Blomber");


        pessoa.getNome();
        pessoa.getTime();


    }
}
