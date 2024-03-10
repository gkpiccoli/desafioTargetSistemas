package com.gkpiccoli.desafiotargetsistemas;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        //Cria um objeto Scanner para ler o input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String originalString = scanner.nextLine();
        scanner.close();
        //Chama o método reversedString para inverter a string fornecida
        String reversedString = reverseString(originalString);
        System.out.println("String original: " + originalString);
        System.out.println("String invertida: " + reversedString);
    }

    public static String reverseString(String str) {
        //Converte a string em array de caracteres
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Troca os caracteres  da esquerda para a direita
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        //Converte o array de volta para um string e a retorna
        return new String(charArray);
    }
}