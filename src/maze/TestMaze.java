/*
  Group Members:
    Logan Thompson
    John Nnamezie
    Robel Adamu
	Noah Weber
*/

package maze;

import java.util.Scanner;

/**
 * Created by Tulin Kilinc
 */
public class TestMaze {
    public static void main(String[] args){

        for (String arg : args)
            if (arg.equalsIgnoreCase("--debugPrint") || arg.equalsIgnoreCase("-dP"))
                Maze.debugPrint = true;

        int[][] mazeArray = {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
                {0,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,1},
                {0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

        Maze myMaze = new Maze(mazeArray);
        boolean keepAsking = true;
        Scanner scan = new Scanner(System.in);
        String input = "";
        myMaze.displayPath();
        System.out.println("Maze Project---");

        do {
            System.out.println("T = Take a step | S = Show path | Q = Quit");
            System.out.print("Enter command: ");
            input = scan.nextLine();
            input.trim();
            input.toLowerCase();
            if(input.equals("t")) {
                keepAsking = !myMaze.takeStep();
                if (keepAsking)
                    myMaze.displayMaze();
                else
                    myMaze.displayPath();
            } else if(input.equals("s")) {
                myMaze.findExit();
                keepAsking = false;
                myMaze.displayPath();
            } else if(input.equals("q")) {
                keepAsking = false;
            } else {
                System.out.println("ERR: Invalid input");
            }
        } while(keepAsking);
        System.out.println("Quitting program...");
        scan.close();
    }
}
