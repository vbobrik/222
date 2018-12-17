import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract public class Methods {
    private String text = "";
    private static final String FILE_PATH = "resources/words.txt";
    Scanner scanner = new Scanner(System.in);


    public void startMessage() {
        System.out.println("Select point from the list, please:\n" +
                "1. Read from file\n" +
                "2. Read from console");
    }

     public void readFile() throws FileNotFoundException {
         File file = new File(FILE_PATH);

         //File file = new File("/Users/Valentina/IdeaProjects/HWtypeLetters/resources/class.txt");
         Scanner scan = new Scanner(file);
         while (scan.hasNext()) {
             text = text + scan.next() + " ";
         }
     }

     public void readConsole() {
         System.out.println("Please, input text for next step");
         text = scanner.nextLine();
     }

    public void findLetter() {
        boolean q = false;
        do {
            System.out.println("Enter one letter and I'll find it into the text");
            String x = scanner.nextLine();

            if (x.equals("exit")) {
                text = "!";

                break;
            }

            String[] savedText = text.split(" ");
            System.out.println("Finded words: ");

            for (String word : savedText) {
                if (word.contains(x)) {
                    System.out.println(word);
                    q = true;
                }

            }

            if (!q) {
                System.out.println("Whoops!\nMatches are absent!");
            }
        } while (!q);

         switch(text) {
             case "!":
            break;
            default:
            System.out.println("--------------*****---------");
            startMessage();
        }

    }
}
