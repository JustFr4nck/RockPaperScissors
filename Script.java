import java.util.Random;
import java.util.Scanner;

public class Script {

   

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name, choose;

        while(true){

            System.out.println("Inserisci il tuo nome: ");
            name = scanner.nextLine();

            if(isAlpha(name)){

                break;
            }

            System.out.println("ERRORE: Inserire nome senza valori numerici");

        }

         System.out.println("\n___INIZIO_GIOCO___");

        while(true){

            System.out.println("\nsasso, carta, forbici: ");
            choose = scanner.nextLine().toLowerCase();

            if(isChoosen(choose)){

                break;
            }

            System.out.println("Errore: inserire una delle 3 mosse richieste");
        }

       
        
    
        scanner.close();
    }

    //METODI

    public static boolean isAlpha(String x){

        for(int i = 0;  i < x.length(); i++){

            if(!Character.isLetter(x.charAt(i))){

                return false;
            }
        }

        return true;
    }

    public static boolean isChoosen(String x){

        if(x.equals("sasso") || x.equals("forbici") || x.equals("carta")){

            return true;
        }

        return false;

    }

}