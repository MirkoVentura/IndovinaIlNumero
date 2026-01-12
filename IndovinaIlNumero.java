import java.util.Random;
import java.util.Scanner;




public class IndovinaIlNumero {
    
    public static void main(String[] args) {



       Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // n parte da 2
        int  n=2;
        
        System.out.println(n);

        int numeroDaIndovinare = random.nextInt( (int) Math.pow(2, n)-1) + 1; // numero tra 1 e (2^n)-1)
        
        System.out.println(numeroDaIndovinare);

        int tentativi = n;
        int tentativo;
        
        System.out.println("=== INDOVINA IL NUMERO ===");
        
        System.out.println("Ho pensato un numero tra 1 e " +( (int) (Math.pow(2, n)-1)  ) + " Prova a indovinarlo!");
        
             while (true) {
                 
            System.out.println("\nTentativi:" + n);
            System.out.print("\nInserisci il tuo tentativo: ");
            tentativo = scanner.nextInt();
            tentativi++;
            
            if(n==1){
                
                System.out.println("HAI PERSOOO");
                break;
                
            }
            
            if (tentativo < numeroDaIndovinare) {
                System.out.println("Troppo basso! Riprova.");
                
                n -=1; //i tentativi diminuiscono
                
            } else if (tentativo > numeroDaIndovinare) {
                System.out.println("Troppo alto! Riprova.");
                
                n -= 1;  //i tentativi diminuiscono
                
            } else {
                
                System.out.println("\n :) Complimenti! Hai indovinato!");
                System.out.println("Il numero era: " + numeroDaIndovinare);
                System.out.println("Tentativi impiegati: " + tentativi);
                break;
                
                
                
            }
        }
        
        scanner.close();
    }
}