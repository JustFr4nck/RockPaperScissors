import java.util.Random;
import java.util.Scanner;

public class Script {

    // MAIN

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name, choose, bot;
        int ran;

        while (true) {

            System.out.println("\nInserisci il tuo nome: ");
            name = scanner.nextLine();

            if (isAlpha(name)) {

                break;
            }

            System.out.println("\nERRORE: Inserire nome senza valori numerici");

        }

        while (true) {

            System.out.println("\n___INIZIO_GIOCO___");

            while (true) {

                System.out.println("\nsasso, carta, forbici: ");
                choose = scanner.nextLine().toLowerCase();

                if (isChoosen(choose)) {

                    break;
                }

                System.out.println("\nErrore: inserire una delle 3 mosse richieste");
            }

            ran = random.nextInt(3);
            bot = botChoose(ran);

            int result = theGame(choose, bot);

            if (result == -1) {

                System.out.println("\n__HAI PERSO T.T__");
            } else if (result == 0) {
                System.out.println("\n__PAREGGIO__");
            } else {
                System.out.println("__" + name + "... HAI VINTO!!!!!__");
            }

            System.out.println("Inserisci 'a' per chiudere");
            String a = scanner.nextLine().toLowerCase();

            if (a.equals("a")) {

                break;
            }

        }

        scanner.close();
    }

    // METODI

    public static boolean isAlpha(String x) {

        for (int i = 0; i < x.length(); i++) {

            if (!Character.isLetter(x.charAt(i))) {

                return false;
            }
        }

        return true;
    }

    public static boolean isChoosen(String x) {

        if (x.equals("sasso") || x.equals("forbici") || x.equals("carta")) {

            return true;
        }

        return false;

    }

    public static String botChoose(int x) {

        if (x == 0) {

            return "sasso";
        } else if (x == 1) {

            return "carta";
        } else {

            return "forbici";
        }
    }

    public static int theGame(String choose, String bot) {

        if (choose.equals(bot)) {
            return 0;
        } else if ((choose.equals("carta") && bot.equals("sasso")) ||
                (choose.equals("forbice") && bot.equals("carta")) ||
                (choose.equals("sasso") && choose.equals("forbice"))) {
            return 1;
        } else {

            return -1;
        }
    }

}