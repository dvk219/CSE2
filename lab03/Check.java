////////////////////////////////////////
//Dmitriy Kim
// lab 03
//recive a check, decide how much tip perctantage to give and split the bill evenly
//use   scanner method
 import java.util.Scanner;
public class Check {
    // main method required for every java program
    
public static void main(String[] args){
   
    
    Scanner myScanner = new Scanner( System.in);
    System.out.print("Enter the original cost for fulfilling one of your basic needs in form xx.xx");
    double checkCost = myScanner.nextDouble(); //accepting user input
System.out.print("Enter the perctantage tip that you wish you generously wish to give as a whole number(in the form xx):");
double tipPercent= myScanner.nextDouble(); //accepting next user input
tipPercent /=100; //converting the percentage into a decimal value


//Entering the number of people at your feast
System.out.print("Enter the number of people who came came to the feast");
int numPeople = myScanner.nextInt();


//Counting the cost of your feast
double totalCost;
double costPerPerson;
int dollars, //whole dollar amount of cost
    dimes, pennies; //for storing digits
                //to the right of the decimal point
                //for the cost$
totalCost=checkCost*(1+tipPercent);
costPerPerson=totalCost/numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int)costPerPerson;
//get dimes amount, e.g.,
//(int) (6.73*10)%10-> 67%10->7
dimes=(int)(costPerPerson*10)%10;
pennies=(int)(costPerPerson*100)%10;
System.out.println("Each person in the group owes $"+dollars+'.'+dimes+pennies);



    
}//end of main method
}//end of class