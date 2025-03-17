package it.epicode.esercizio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 10 (0 per Terminare) : ");
        int numeroInserito = scanner.nextInt();
        System.out.println("Inserisci la posizione del numero inserito (tra 1 e 5) :");
        int posizione = scanner.nextInt();

        System.out.println("Il numero inserito è " + numeroInserito + " e la sua posizione occupata è: " + posizione );

    }
}
