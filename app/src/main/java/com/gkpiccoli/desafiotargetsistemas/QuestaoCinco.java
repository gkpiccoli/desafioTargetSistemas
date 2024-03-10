package com.gkpiccoli.desafiotargetsistemas;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String originalString = scanner.nextLine();
        scanner.close();

        String reversedString = reverseString(originalString);
        System.out.println("String original: " + originalString);
        System.out.println("String invertida: " + reversedString);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Troca os caracteres da frase da esquerda para direita
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}