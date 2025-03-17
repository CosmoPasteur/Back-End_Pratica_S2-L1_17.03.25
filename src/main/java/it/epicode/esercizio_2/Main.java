package it.epicode.esercizio_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserire il kilometraggio");

            int km = scanner.nextInt();

            System.out.println("Inserire il numero di km percorsi");
            int litri = scanner.nextInt();

            if (litri == 0) {
                logger.error("Il num di litri non può essere 0.");
                return;
            }

            double consumo = km/litri;

            System.out.println("Il consumo medio è di" +consumo+ "km/l");
        } catch (Exception e) {
            logger.error("Errore: numero inserito errato.");
        }


    }
}
