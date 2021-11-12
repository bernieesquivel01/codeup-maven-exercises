import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Maven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String userChoice = sc.nextLine();

        System.out.printf("You Entered: \"%s\"", userChoice);
        System.out.println();

        String userEnteredNum;
        if(StringUtils.isNumeric(userChoice)){
            userEnteredNum = "is a number";
        } else {
            userEnteredNum = "is not a number";
        }

        System.out.printf("\"%s\" %s", userChoice, userEnteredNum);
        System.out.println();
        System.out.printf("Flipped Case: %s", StringUtils.swapCase(userChoice));
        System.out.println();
        System.out.printf("Reversed: %s", StringUtils.reverse(userChoice));
    }
}
