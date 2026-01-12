import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumero {
    private static final int MAX_TENTATIVI = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean rigioca = true;

        System.out.println("=== INDOVINA IL NUMERO ===");

        while (rigioca) {
            int numeroDaIndovinare = random.nextInt(100) + 1; // numero tra 1 e 100
            int tentativi = 0;
            int tentativo;

            System.out.println("\nHo pensato un numero tra 1 e 100. Prova a indovinarlo!");

            while (tentativi < MAX_TENTATIVI) {
                System.out.print("Inserisci il tuo tentativo: ");
                tentativo = scanner.nextInt();
                tentativi++;

                if (tentativo < numeroDaIndovinare) {
                    System.out.println("Troppo basso! Riprova.");
                } else if (tentativo > numeroDaIndovinare) {
                    System.out.println("Troppo alto! Riprova.");
                } else {
                    System.out.println("\n:) Complimenti! Hai indovinato!");
                    System.out.println("Il numero era: " + numeroDaIndovinare);
                    System.out.println("Tentativi impiegati: " + tentativi);
                    break;
                }
            }

            if (tentativi == MAX_TENTATIVI) {
                System.out.println("\nHai esaurito i tentativi!");
                System.out.println("Il numero corretto era: " + numeroDaIndovinare);
            }

            System.out.print("\nVuoi giocare di nuovo? (1 = sì, 0 = no): ");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                rigioca = false;
                System.out.println("\nGrazie per aver giocato!");
            }
        }

        scanner.close();
    }
}