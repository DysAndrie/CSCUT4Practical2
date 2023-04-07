import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 * 3140298
 * M.I Checkpoint #4 
 */
public class FilesInOut {

    public static void main(String[] args) {
    
        // Specifying the inputfile of the textfile. 
    File inputFile = new File("C:\\Users\\admin\\Desktop\\Managing Information\\0_MI_TO-DO\\Checkpoint#4\\CSCUT4Practical2-main\\input.txt");
    File outputFile = new File("C:\\\\Users\\\\admin\\\\Desktop\\\\Managing Information\\\\0_MI_TO-DO\\\\Checkpoint#4\\\\CSCUT4Practical2-main\\\\output.txt");

 // Set up a new Scanner to read the input file.
        try {
        Scanner in = new Scanner(inputFile);
        // Creating the printwriter to write to output file
        PrintWriter out = new PrintWriter(outputFile);

            while (in.hasNextLine())  // While loop which goes through each line in the input file
            {
                String line = in.nextLine(); 
                String[] space = line.split(" "); // The String.split method' splits the line into an array of words
                StringBuilder nameFormat = new StringBuilder();// Create a stringbuilder to hold the formatted name
                String dateFormat = ""; // Declare a string to hold the formatted date

               // That is, read a line, write a line, loop.
              for (int i = 0; i < space.length; i++)  // For loop which iterates through the line of each letter 
                {
                    String word = space[i];

                    if (i == 0) {  	
                    	// For the first word which capitalizes the first letter and turn the rest to lowercase 
                        String formattedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                        nameFormat.append(formattedWord);
              	
                    	 // For the last word which capitalizes the first letter and turn the rest to lowercase and seperates the digits
                    } else if (i == 2 && word.length() == 1) { 	
                    	nameFormat.append(" " + word.toUpperCase() + ".");
                    	
                    	// For other words in between
                    } else {
                        String formattedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                        nameFormat.append(" " + formattedWord.replaceAll("[0-9]", ""));
                    }
                }

        // Finally, add code to read the filenames as arguments from the command line.
                // Gets the index of the last space in the input line,
                int dateIndex = line.lastIndexOf(" ");  // which separates the name from the date string
                String dateString = line.substring(dateIndex + 1); // Extract the date string from the input line, which
                // starts after the last space and goes until the end of the line
                
                // Extract the day, month, and year from the date string
                // Day is the first two characters, month is the next two characters, year is the rest
                String day = dateString.substring(0, 2);
                String month = dateString.substring(2, 4);
                String year = dateString.substring(4);
                  // Format the date string as dd/mm/yyyy
                dateFormat = day + "/" + month + "/" + year;

                // write formatted output to file
                out.printf("%-20s%s\n", nameFormat, dateFormat);
            }

            in.close();
            out.close();
    }
    
    catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    } // main
    
}  // FilesInOut
