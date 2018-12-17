import java.io.*;
import java.util.Scanner;


public class Messages extends Methods{
    private String error;
    private String number;




    public void typeNumber() throws FileNotFoundException {


        do {

            number = scanner.nextLine();
            switch (number) {
                case "1":
                    super.readFile();
                    super.findLetter();
                    break;

                case "2":
                    super.readConsole();
                    super.findLetter();
                    break;

               case "exit":
                   break;

                default:
                    System.out.println("Whoooops!\nIt's not correct enter");
                    break;
            }
        } while (!number.equals("1") && !number.equals("2") && !number.equals("exit"));

        System.out.println("Goodbye");
    }


}



