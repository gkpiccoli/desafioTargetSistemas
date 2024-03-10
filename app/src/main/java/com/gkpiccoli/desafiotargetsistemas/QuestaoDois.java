package com.gkpiccoli.desafiotargetsistemas;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe para verificar se um número pertence à sequência de Fibonacci.
 */
public class QuestaoDois {
    private static final long MAX_FIBONACCI_NUMBER = 7540113804746346429L; // Maior número inteiro pertencente à sequência de Fibonacci (fibonacci(92))

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite um número inteiro para verificar se pertence à sequência de Fibonacci: ");
                try {
                    long numero = getValidLongInput(scanner);

                    Fibonacci fibonacci = new Fibonacci();
                    if (fibonacci.isMemberOfFibonacciSequence(numero)) {
                        System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                    } else {
                        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    scanner.nextLine(); // Limpar o buffer de entrada
                }
            }
        }
    }

    /**
     * Obtém uma entrada de número inteiro válida do usuário.
     *
     * @param scanner O objeto Scanner para ler a entrada do usuário.
     * @return O número inteiro válido inserido pelo usuário.
     * @throws InputMismatchException Se a entrada não for um número inteiro válido.
     */
    private static long getValidLongInput(Scanner scanner) throws InputMismatchException {
        return scanner.nextLong();
    }

    /**
     * Classe para gerar e verificar a sequência de Fibonacci.
     */
    private static class Fibonacci {
        /**
         * Verifica se um número pertence à sequência de Fibonacci.
         *
         * @param num O número a ser verificado.
         * @return true se o número pertence à sequência de Fibonacci, false caso contrário.
         */
        public boolean isMemberOfFibonacciSequence(long num) {
            if (num < 0 || num > MAX_FIBONACCI_NUMBER) {
                return false; // O número está fora do intervalo da sequência de Fibonacci
            }

            long a = 0, b = 1;
            if (num == a || num == b) {
                return true;
            }

            long c = a + b;
            while (c < num) {
                a = b;
                b = c;
                c = a + b;
            }

            return c == num;
        }
    }
}
