////////////////////////////////////////////////////////////////
//Dmitriy Kim
//lab 06
//payroll timeSheets
// create a program tha will calculate the total bill for every workrer

import java.util.Scanner; //importing the scanner

public class timeSheets{ //stating class
    public static void main(String[] args) // creating the main method
    {
        Scanner myscanner = new Scanner(System.in); //creating the scanner
        //setting the variables: 
                  
        double rate = 0;    //their payment inc cents per hour
        double day = 0;    //amount of hours each day
        double total = 0;
    //for(emp<)    
    System.out.println("How many workers do you have?ʕʘ̅͜ʘ̅ʔ");
    int emp = myscanner.nextInt(); //number of employees
    for(int i=0; i<emp; i++ ){ // count untile the number employees ends
    System.out.println("What is the pay per hour? [̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
    rate = myscanner.nextInt();
    for(int j=0; j<5; j++){ //there are five days in the week so we do it five times
    System.out.println("How many working hours on Day "+j);
    day = myscanner.nextInt(); //repeating every day
    total=total+day*rate; //calculating the total pay
    }
    }
    
   
    
    System.out.println("The total payment per week is  つ ◕_◕ ༽つ つ ◕_◕ ༽つ *gimme-gimme"+total);
    }
}
    
    
    

    
     
    