import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroDaIndovinare = random.nextInt(100) + 1; // numero tra 1 e 100
        int tentativi = 10;
        int tentativo;
        
        System.out.println("=== INDOVINA IL NUMERO ===");
        System.out.println("Ho pensato un numero tra 1 e 100. Prova a indovinarlo!");

        if(tentativi == 0){
                System.out.println("Hai perso. HAI ESAURITO TUTTI I TENTATIVI!");
        
            }else{
                while (true) {
            System.out.print("\nInserisci il tuo tentativo: ");
            tentativo = scanner.nextInt();
            
                if (tentativo < numeroDaIndovinare) {
                System.out.println("Troppo basso! Riprova.");
                tentativi--;
            } else if (tentativo > numeroDaIndovinare) {
                System.out.println("Troppo alto! Riprova.");
                tentativi--;
            } else {
                System.out.println("\n :) Complimenti! Hai indovinato!");
                System.out.println("Il numero era: " + numeroDaIndovinare);
                System.out.println("Tentativi impiegati: " + tentativi);
                break;
            }
        }

            }
        

        
        scanner.close();
    }
}