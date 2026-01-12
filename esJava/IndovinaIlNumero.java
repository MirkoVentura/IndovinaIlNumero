import java.util.Random;
import java.io.*;

public class IndovinaIlNumero {
    static BufferedReader buffer;

    public static void main(String[] args) {
        Random random = new Random();
        buffer = new BufferedReader(new InputStreamReader(System.in));
        
        int numeroDaIndovinare = random.nextInt(100) + 1; // numero tra 1 e 100
        int tentativi = 0;
        int tentativo;
        
        System.out.println("=== INDOVINA IL NUMERO ===");
        System.out.println("Ho pensato un numero tra 1 e 100. Prova a indovinarlo!");
      
        do{

                tentativo = leggiInt("\nInserisci il tuo tentativo:");
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
        }while(tentativi < 10);
        System.out.println("Tentativi terminati");
    
    }

    public static int leggiInt(String msg){
        int n = 0;
        while(true){
            System.out.print(msg);
            try{
                n = Integer.parseInt(buffer.readLine());
            }catch(Exception e){
                System.out.println("Inserisci numero");
            }
            return n;
        }
    }
}