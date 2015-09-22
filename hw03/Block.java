////////////////////////////////////////////////////////
//Dmitriy Kim
// hw 03
// Block.java
// program will calculate the volume of block based on its length, width and height
import java.util.Scanner;

public class Block { // creating class and main method
public static void main(String[] args) // creating the class type
{
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Enter the length of the block in x.x format");
    float a = myscanner.nextFloat();//creating scanner for the next input
    System.out.println("Enter the width of the block in x.x format");
    float b = myscanner.nextFloat(); //creating scanner for the next input
    System.out.println("Enter the height of the block in x.x format");
    float c = myscanner.nextFloat();//creating scanner for the next input
    float volume=a*b*c; // formula for finding the volume
    float surface=(2*a*b)+(2*b*c)+(2*a*c); // formula for finding the surface area
    System.out.println("The volume of the block dimensions "+a+ " x " +b+ " x " +c+ " = " +volume ); // creating the output including the variables in
    System.out.println("The surface of the block is  " +surface);
    
}
}