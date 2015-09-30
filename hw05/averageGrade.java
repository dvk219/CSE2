////////////////////////////////////////////////////////////////////
//Dmitriy V Kim
//homework 05
//average grade calculator
import java.util.Scanner; //importing scanner for 

public class averageGrade { // creating class
public static void main(String[] args) //creatig the maing method
{

{
Scanner myscanner=new Scanner(System.in);
 double a = 0; //givining intial count of zero
 double score=0; //zero initial total score
 double n=0; //initial count-0
while((a>=0) && (a<=100)){ //creating range for score values
    
    System.out.println("Enter Albert Eintstein's Physics grade[999=exit]");
    a = myscanner.nextDouble(); //creating input for next scores
    if(a==999){ //creating exit statement
    break;//break is needed for statement to stop and cancel adding 999 to the total
    }
    score=score+a; //add new scores to the total
    n=n+1; //making each count
    
    
    
}
double av=score/n; //finding the average
System.out.println("The average Albert Eintstein's score is "+av); //anwser
}
}   
}


