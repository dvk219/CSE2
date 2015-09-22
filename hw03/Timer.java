//////////////////////////////////////////////////////////
//Dmitriy V. Kim
//HW03
//TImer
//creating timer that shows remaining time 
import java.util.Scanner; //importing scanner

public class Timer{ //creating class
public static void main(String[] args) //setting the maing method
{
    Scanner myscanner=new Scanner(System.in); // creating scanner
    System.out.println("Enter the current time in military style: xx(h).yy(min)");
    int a = myscanner.nextInt();//settign variable for a
    System.out.println("Enter the time of dinner");
    int b = myscanner.nextInt(); // setting variable for b
    int h=(b/100)-(a/100); //converting hours to 2-digit and finding the amount of hours
    int m=(b % 100)-(a % 100); // finding the remainder =minutes   
    System.out.println("The remaning time is " +h+ ":" +m); // creating the output adding hours and minutes seperately
}
}