import java.util.Random;
import java.util.Scanner;

public class Script {

   

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name;

        while(true){

            System.out.println("Inserisci il tuo nome: ");
            name = scanner.nextLine();

            if(isAlpha(name)){

                break;
            }

            System.out.println("ERRORE: Inserire nome senza valori numerici");

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

}