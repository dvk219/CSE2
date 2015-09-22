//////////////////////////////////////////////////////////
//Dmitriy V. Kim
//HW03
//TImer
//creating timer that shows remaining time 
import java.util.Scanner; //importing scanner

public class Timer{ //creating class
public static void main(String[] args)
{
    Scanner myscanner=new Scanner(System.in);
    System.out.println("Enter the current time in military style: xx(h).yy(min)");
    int a = myscanner.nextInt();
    System.out.println("Enter the time of dinner");
    int b = myscanner.nextInt();
    int h=(b/100)-(a/100);
    int m=(b % 100)-(a % 100);    
    System.out.println("The remaning time is " +h+ ":" +m);
}
}