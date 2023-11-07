package edu.utfpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringFormaterHandler handler = new SpaceHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase alfanumérica:");
        String result = handler.handle(scanner.nextLine());
        System.out.println("Sua frase formatada é: ");
        System.out.println(result);
    }
}