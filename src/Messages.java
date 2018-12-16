import java.io.*;
import java.util.Scanner;
import java.util.Arrays;


public class Messages {
    private String error;
    private String letter;
    private String text;
    private char[] hz;
    Scanner a = new Scanner(System.in);

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

                    //File file = new File("D:/MY/HWtypeLetters/src/resources/words.txt");
                    File file = new File("/Users/Valentina/IdeaProjects/HWtypeLetters/resources/class.txt");
                    Scanner scan = new Scanner(file);
                    String p = "";
                    while (scan.hasNext()) {
                        //String words = scan.next();
                        //System.out.println(scan.next());
                        p = p + scan.next() + " ";
                    }
                    text = p;
                    findLetter();
                    break;

                case "2":
                    System.out.println("Please, input text for next step");
                    text = a.nextLine();
                    findLetter();
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
        int q = 0;
        while (q == 0) {
            System.out.println("Enter one letter and I'll find it into the text");
            String x = a.nextLine();

                String[] savedText = text.split(" ");
                System.out.println("Finded words: ");

                for (int i = 0; i < savedText.length; i++) {
                    if (savedText[i].contains(x)) {
                        System.out.println(savedText[i]);
                        q++;
                    }

                }
                if (q == 0) {
                    System.out.println("Whoops!\nMatches are absent!");
                }




        }
        System.out.println("--------------*****---------");
        startMessage();
    }


}

