package lab;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {

static String[][] matrix;
    
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String[] dimensions = input.nextLine().split(" ");

		int r = Integer.parseInt(dimensions[0]);
		int c = Integer.parseInt(dimensions[1]);

		matrix = new String[r][c];

		// get input
		for (int i = 0; i < r; i++) {
			matrix[i] = input.nextLine().split(" ");
		}
		
		String line = input.nextLine();
		String[] commandLine;
		
		// get and execute commands
		while(!line.equals("END")) {
		    commandLine = line.split(" ");
		    if (checkIfCommandIsValid(commandLine)) {
		        if (commandLine.length == 5 && checkIfCoordinatesAreValid(commandLine)) {
		            swap(commandLine);
		            print();
		        } else {
		            System.out.println("Invalid input!");
		        }
		    } else {
		        System.out.println("Invalid input!");
		    }
		    line = input.nextLine();
		}


	}

    static void print() {
        
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]).replaceAll("(\\[|\\]|,)", ""));
        }
        
    }

	static void swap(String[] commandLine) {
	    
	    int currI = Integer.parseInt(commandLine[1]);
	    int currJ = Integer.parseInt(commandLine[2]);
	    int swapI = Integer.parseInt(commandLine[3]);
	    int swapJ = Integer.parseInt(commandLine[4]);
	    
	    String temp = matrix[currI][currJ];
	    
	    matrix[currI][currJ] = matrix[swapI][swapJ];
	    matrix[swapI][swapJ] = temp;
	    
	}
	
    static boolean checkIfCommandIsValid(String[] commands) {
        
        if(commands[0].equals("swap")) {
            return true;
        }
        
        return false;
        
    }
   
    static boolean checkIfCoordinatesAreValid(String[] commands) {
        
        if (Integer.parseInt(commands[1]) < matrix.length && Integer.parseInt(commands[2]) < matrix[0].length) {
            if (Integer.parseInt(commands[3]) < matrix.length && Integer.parseInt(commands[4]) < matrix[0].length) {
                return true;
            }
        }
        return false;
    }
   
}
