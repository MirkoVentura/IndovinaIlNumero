import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroDaIndovinare = random.nextInt(100) + 1; // numero tra 1 e 100
        int tentativi = 0;
        int tentativo;
        int scelta = 0;
        
        System.out.println("=== INDOVINA IL NUMERO ===");
        System.out.println("Ho pensato un numero tra 1 e 100. Prova a indovinarlo!");
        do{
             while (true) {
                System.out.print("\nInserisci il tuo tentativo: ");
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
            
            System.out.println("Vuoi fare un'altra partita? Inserisci 0 per no e 1 per sì.");
            scelta = scanner.nextInt();
        
            //scanner.close();
        }while(scelta == 1);
       scanner.close();
    }
}