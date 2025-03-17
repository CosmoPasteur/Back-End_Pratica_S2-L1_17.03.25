package it.epicode.esercizio_1;

import java.util.Scanner;

public class NumeroCasuale {
    //scrivere un array di 5 interi con valori casuali tra 1 e 10 e stampa in console
    int numeroInserito;
    int posizione;

    public void numeriCasuali() {
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[5];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = (int) (Math.random() * 10 + 1);
            System.out.println(numeri[i]);
        }

        while (true) {
            System.out.println("Inserisci un numero da 1 a 10 (0 per Terminare) :");
            numeroInserito = scanner.nextInt();
            if (numeroInserito == 0) {
                scanner.close();
            } else {
                System.out.println("Inserisci la posizione del numero inserito :");
                posizione = scanner.nextInt();
                numeri[posizione] = numeroInserito;
                System.out.println("Il numero inserito è: " + numeroInserito + " e la sua posizione occupata è: " + posizione);
            }
        }
    }
}