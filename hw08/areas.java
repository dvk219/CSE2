////////////////////////////////////////////////////
//Dmitriy V. Kim
//hw08
//areas
//overloading methods
import java.util.Scanner;  //import of scanner

public class areas{ //creating class
    public static void main(String args[]){
            
        Scanner myscanner = new Scanner(System.in); //scanner for next imput
        System.out.println("Enter shape(circle: '1'; rectangle:'2'; trapezoid:'3'"); //creating cases for each type of shape and assigning them a variable
        int shape = myscanner.nextInt();
        switch(shape)
        {
    case 1: //calling circle method
    {
        System.out.println("Enter radius");
        int r =myscanner.nextInt(); //scanning next int
        area(r); //calling method with radius as an input
        break; //once it is deone stope the case
    }
    case 2: //calling rectangle
    {
        System.out.println("Enter height");
        int h=myscanner.nextInt();
        System.out.println("Enter widhth");
        int w=myscanner.nextInt();
        area(h,w); //in this case we have diffrenet variables not to mix them up. It also has two variables comparing to one of the previous
        break; //always break
    }
    case 3: // calling trapezoid
    {
        System.out.print("Enter upper widhth");
        int t=myscanner.nextInt();
        System.out.print("Enter lower widhth");
        int b=myscanner.nextInt();
        System.out.print("Enter height");
        int h=myscanner.nextInt();
        area(t,b,h);// this case has three variables
        break;
    }
        
    }
    }
//CIRCLE AREA
        
        public static void area(int r)
        {
            double s =3.1415*r*r; //formula for circle shape. We also assign a double type since pi is irrational nubmber
            System.out.println("The area of the circle is "+s);
        }
//RECTANGLE AREA
        public static void area(int h, int w)
        {
         System.out.println("The area of the rectangle is "+h*w); //formula for rectangle is simple and can be inputed inside a print statemetn
        }
//TRAPEOZOID AREA
        public static void area(int t, int b, int h)
        {
        double trapezoidArea = (t+b)*h/2; //formula of trapezoid is more complexed and could be a double, so we assign a DOUBLE type 
        System.out.println("The area of the trapezoid is "+trapezoidArea);
        }
    
        
    }
    
    
        
        
        
        
        
        
   