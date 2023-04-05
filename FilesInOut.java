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
    
        // Specificying the inputfile of the textfile. 
	File inputFile = new File("C:\\Users\\admin\\Desktop\\Managing Information\\0_MI_TO-DO\\Checkpoint#4\\CSCUT4Practical2-main\\input.txt");
    File outputFile = new File("C:\\\\Users\\\\admin\\\\Desktop\\\\Managing Information\\\\0_MI_TO-DO\\\\Checkpoint#4\\\\CSCUT4Practical2-main\\\\output.txt");

 // Set up a new Scanner to read the input file.
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter(outputFile);


      
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
