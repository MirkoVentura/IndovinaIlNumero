import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroDaIndovinare = random.nextInt(100) + 1; // numero tra 1 e 100
        int tentativi = 0;
        int tentativo;
        
        
        
        IndovinaIlNumero.menu();
        scanner.close();
    }

    private static void menu(){
        System.out.println("-------MENU-------");
        System.out.println("\n1.Avvia gioco");
        System.out.println("\n2.Esci dal gioco");
        System.out.println("-------------------");
    }

    

    /*
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
            }*/
}

