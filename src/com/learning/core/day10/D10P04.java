package com.learning.core.day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class D10P04 
{
    public static void main(String[] args) 
    {
        
    	Path source = Paths.get("C:\\Users\\zahur\\Desktop\\Github\\programs\\src\\com\\learning\\core\\day10\\Source10.txt");
    	
        
    	Path destination = Paths.get("C:\\Users\\zahur\\Desktop\\Github\\programs\\src\\com\\learning\\core\\day10\\Destination10.txt");

        try 
        {
        	
            Files.copy(source, destination);
            System.out.println("File copied successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}