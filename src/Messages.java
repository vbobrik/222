import java.io.*;
import java.util.Scanner;


public class Messages {
    private String error;
    private String letter;
    private String text = "";
    private char[] hz;
    Scanner a = new Scanner(System.in);

    private static final String FILE_PATH = "resources/words.txt";

    public String getError() {
        return error;
    }

    public void startMessage() {
        System.out.println("Select point from the list, please:\n" +
                "1. Read from file\n" +
                "2. Read from console");
    }


    public void typeLetter() throws FileNotFoundException {


        do {

            letter = a.nextLine();
            switch (letter) {
                case "1":

                    File file = new File(FILE_PATH);

                    //File file = new File("/Users/Valentina/IdeaProjects/HWtypeLetters/resources/class.txt");
                    Scanner scan = new Scanner(file);
                    //String p = "";
                    while (scan.hasNext()) {
                        //String words = scan.next();
                        //System.out.println(scan.next());
                        text = text + scan.next() + " ";
                    }
                    //text = p;
                    findLetter();
                    break;

                case "2":
                    System.out.println("Please, input text for next step");
                    text = a.nextLine();
                    findLetter();
                    break;

                case "exit":
                    break;

                default:
                    System.out.println("Whoooops!\nIt's not correct enter");
                    break;
            }
        } while (!letter.equals("exit"));

        //   FileReader f1 = new FileReader("/Users/Valentina/IdeaProjects/HWtypeLetters/resources/class.txt");
        //BufferedReader b = new BufferedReader(f1);

        System.out.println("Goodbye");
    }

    public void findLetter() {
        boolean q = false;
        do {
            System.out.println("Enter one letter and I'll find it into the text");
            String x = a.nextLine();

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

        System.out.println("--------------*****---------");
        startMessage();
    }


}

