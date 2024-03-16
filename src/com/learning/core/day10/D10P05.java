package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class D10P05 {

	public static void main(String[] args) {
		String input;
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine();
        writeToFile(input);			//create a file
        showFileSize("src/com/learning/core/day10/io.txt");
        readAndDisplay("src/com/learning/core/day10/io.txt");
        deleteFile("src/com/learning/core/day10/io.txt");		//file will be deleted
        sc.close();
	}
	 public static void writeToFile(String input) {
	        try {
	            FileWriter writer = new FileWriter("src/com/learning/core/day10/io.txt");
	            writer.write(input);
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 public static void showFileSize(String fileName) {
	        File file = new File(fileName);
	        if (file.exists()) {
	            System.out.println("size of the file: " + file.length() + " bytes");
	        } else {
	            System.out.println("File does not exist.");
	        }
	    }
	 public static void readAndDisplay(String fileName) {
	        try {
	            FileReader reader = new FileReader(fileName);
	            int character;
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            System.out.println("");
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 public static void deleteFile(String fileName) {
	        File file = new File(fileName);
	        if (file.delete()) {
	            System.out.println("File deleted successfully.");
	        } else {
	            System.out.println("Failed to delete the file.");
	        }
	    }
	}