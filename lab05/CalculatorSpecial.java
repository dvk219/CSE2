//////////////////////////////////
//Dmitriy V. Kim
//lab05
//
import java.util.Scanner; //import scanner

public class CalculatorSpecial { //creating class and main method
public static void main(String[] args)

{
    Scanner myscanner=new Scanner(System.in);
    String y = "";
    do{
    System.out.println("Eneter your first integer");
    int a = myscanner.nextInt();
    System.out.println("Enter your second integer");
    int b = myscanner.nextInt();
    System.out.println("Enter your symbol");
    char operator = myscanner.next().charAt(0);
        switch(operator){
        case '+':
                int add=a+b; //equation for sum
                System.out.println("The sum equals "+add);
                break; // stopping the porgram
        case '-':
            int sub1=a-b; //eqaution for subtraction
            System.out.println("Subtraction equals "+sub1);
            break; // stop
        case '*':
            int mul=a*b; // equation for mult
            System.out.println("The multiplication equals " +mul);
            break; // stop
        case '/':
            double dev=(double)a/(double)b; //equation for devision
            System.out.println("The devision equals" +dev);
            break;
            default:
            System.out.println("Invalid operator ");
            break;
        }
        System.out.println("Print N or n");
        y = myscanner.next();
        
        }
        

        
        while(!y.equals ("n") && !y.equals ("N"));
        }
    
    
}


        
    
        

