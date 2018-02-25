package sudoku.game;

import java.util.Scanner;

public class SudokuEnd {

    public Boolean theEnd(Scanner scan) {
        String chose = "";
        boolean again = true;
        System.out.println("Do You want play again? \n Yes please 'y' and enter. \n No please 'n' and enter.");
        while (!scan.hasNext("[yn]")) {
            System.out.println("Wrong char please enter y or n");
            scan.next();
        }
        String whatnext = scan.next();
        if (whatnext.equals("y")) {
            again = true;
        } else if (whatnext.equals("n")) {
            System.out.println("Are you sure you want to finish game?");
            while (!scan.hasNext("[yn]")) {
                System.out.println("Wrong char please enter 'y' to end program or 'n' to play again");
                scan.next();
            }
            chose = scan.next();
            if (chose.equals("n")){
                again = true;
            } else {
                again = false;
            }
        }
        return again;
    }
}
