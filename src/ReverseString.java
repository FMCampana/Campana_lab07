import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);   
		System.out.println("Enter a phrase");  
		  String name = sc.nextLine();  
		
		String str = name ;
			
		System.out.println("Original string: " +str);
        String reversed = reverseRec(str);
        System.out.println("The reversed string is: " + reversed);
		
        Scanner sc2=new Scanner(System.in);   
		System.out.println("Enter a phrase");  
		  String name2=sc2.nextLine();  
        
		System.out.println("the reversed String: ");
		String input = name2;
		 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        for (int i=0; i<input1.length(); i++)
            System.out.print(input1.charAt(i));
        
    }
	
	
	public static String reverseRec(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseRec(str.substring(1)) + str.charAt(0) ;
    }
		
	}

	
