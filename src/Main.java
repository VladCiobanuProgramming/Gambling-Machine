import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int RandomSlot;
        int n = 4, i, j;
        String SlotOutput = "";
        String UserInputChoice;
        System.out.print("Welcome to the Casino , enter any input to spin the machine or type 'exit' if you wish to return :");
        while(true) {
            UserInputChoice = scanner.nextLine();
            UserInputChoice = UserInputChoice.toLowerCase();
            if(UserInputChoice.equals("exit")) {
                scanner.close();
                return;
            }
            else if (UserInputChoice!="exit") {
                for (i = 0; i <= n; i++) {
                    RandomSlot = rand.nextInt(4);
                    switch (RandomSlot) {
                        case 0: // if randomslot == 0
                            SlotOutput += "| Cherry |";
                            break;
                        case 1:
                            SlotOutput += "| 7 |";
                            break;
                        case 2:
                            SlotOutput += "| Lemon |";
                            break;
                        case 3:
                            SlotOutput += "| Plum |";
                            break;
                        default:

                    }
                }
                System.out.println("---------------");
                System.out.println(SlotOutput);
                System.out.print("Enter any input to play again or 'exit' to return: ");
                SlotOutput="";
            }
        }
    }
}