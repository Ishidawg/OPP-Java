package main.java.br.unipar;

public class Main {

    public static void main(String[] args) {
        //Override test
        Cao caozinho = new Cao();

        System.out.println(caozinho.emitirSom());

        //Overloading test
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(1, 1));
    }
}