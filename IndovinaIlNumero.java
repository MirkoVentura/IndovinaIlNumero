import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int tentativo;       
        int scelta;
        
        System.out.println("=== INDOVINA IL NUMERO ===");
        System.out.println("Ho pensato un numero tra 1 e 100. Prova a indovinarlo!");

        do{

            int numeroDaIndovinare = random.nextInt(100) + 1; // numero tra 1 e 100
            int tentativi = 0;
        
            while (true) {
                System.out.println("Inserisci il tuo tentativo: ");
                tentativo = scanner.nextInt();
                tentativi++;
                
                if (tentativo < numeroDaIndovinare) {
                    System.out.println("Troppo basso! Riprova.");
                } else if (tentativo > numeroDaIndovinare) {
                    System.out.println("Troppo alto! Riprova.");
                } else {
                    System.out.println("\n :) Complimenti! Hai indovinato!");
                    System.out.println("Il numero era: " + numeroDaIndovinare);
                    System.out.println("Tentativi impiegati: " + tentativi);
                    break;
                }

            }

            System.out.println("Vuoi giocare ancora? Inserisci: 1 per giocare, 0 per uscire dal gioco");
            scelta = scanner.nextInt();

        } while(scelta != 0);
        
        scanner.close();
    }
}