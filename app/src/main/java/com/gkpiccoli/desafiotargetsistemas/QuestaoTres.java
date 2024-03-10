package com.gkpiccoli.desafiotargetsistemas;
public class QuestaoTres {

    public static void main(String[] args) {
        // Sequência a)
        proximoElementoA();

        // Sequência b)
        proximoElementoB();

        // Sequência c)
        proximoElementoC();

        // Sequência d)
        proximoElementoD();

        // Sequência e)
        proximoElementoE();

        // Sequência f)
        proximoElementoF();
    }

    // Método para calcular o próximo elemento da sequência a)
    public static void proximoElementoA() {
        int ultimoElemento = 7;
        int proximoElemento = ultimoElemento + 2;
        System.out.println("Próximo elemento da sequência a): " + proximoElemento); // Saída: 9
    }

    // Método para calcular o próximo elemento da sequência b)
    public static void proximoElementoB() {
        int ultimoElemento = 64;
        int proximoElemento = ultimoElemento * 2;
        System.out.println("Próximo elemento da sequência b): " + proximoElemento); // Saída: 128
    }

    // Método para calcular o próximo elemento da sequência c)
    public static void proximoElementoC() {
        int ultimoElemento = 36;
        int raiz = (int) Math.sqrt(ultimoElemento);
        int proximoElemento = (raiz + 1) * (raiz + 1);
        System.out.println("Próximo elemento da sequência c): " + proximoElemento); // Saída: 49
    }

    // Método para calcular o próximo elemento da sequência d)
    public static void proximoElementoD() {
        int ultimoElemento = 64;
        int raiz = (int) Math.sqrt(ultimoElemento);
        int proximoElemento = (raiz + 2) * (raiz + 2);
        System.out.println("Próximo elemento da sequência d): " + proximoElemento); // Saída: 100
    }

    // Método para calcular o próximo elemento da sequência e)
    public static void proximoElementoE() {
        int penultimoElemento = 5;
        int ultimoElemento = 8;
        int proximoElemento = penultimoElemento + ultimoElemento;
        System.out.println("Próximo elemento da sequência e): " + proximoElemento); // Saída: 13
    }

    // Método para calcular o próximo elemento da sequência f)
    public static void proximoElementoF() {
        int ultimoElemento = 19;
        int proximoElemento = ultimoElemento + 1;
        System.out.println("Próximo elemento da sequência f): " + proximoElemento); // Saída: 20
    }
}