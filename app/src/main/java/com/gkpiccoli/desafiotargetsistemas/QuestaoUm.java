package com.gkpiccoli.desafiotargetsistemas;

public class QuestaoUm {
    public static void main(String[] args) {
        // Declaração da constante INDICE e inicialização com o valor 13
        int INDICE = 13;
        // Variável SOMA para armazenar a soma dos números
        int SOMA = 0;

        // Loop for que itera de 1 até o valor de INDICE
        // Inicializa K com 1; itera enquanto K for menor ou igual a INDICE; incrementa K a cada iteração
        for (int K = 1; K <= INDICE; K++) {
            // Adiciona o valor de K à variável SOMA em cada iteração
            SOMA += K;
        }

        // Imprime uma mensagem explicativa junto com o valor final da soma
        System.out.println("A soma dos números de 1 até " + INDICE + " é: " + SOMA);
    }
}
