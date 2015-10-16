/////////////////////////////////////////////////////////////////
//Dmitriy V. Kim
//lab08
//using different types of methods
import java.util.Scanner; //import is always outisde the methods
public class methods{ //the compiling method is outside of the main method
    public static void main(String args[]){ //maing method with no changes
        Scanner myscanner = new Scanner(System.in); //creating scanner  
        System.out.println("Enter number"); //input for 10 variables
        int a = myscanner.nextInt();
        System.out.println("Enter number");
        int b = myscanner.nextInt();
        System.out.println("Enter number");
        int c = myscanner.nextInt();
        System.out.println("Enter number");
        int d = myscanner.nextInt();
        System.out.println("Enter number");
        int e = myscanner.nextInt();
        System.out.println("Enter number");
        int f = myscanner.nextInt();
        System.out.println("Enter number");
        int g = myscanner.nextInt();
        System.out.println("Enter number");
        int h = myscanner.nextInt();
        System.out.println("Enter number");
        int i = myscanner.nextInt();
        System.out.println("Enter number");
        int j = myscanner.nextInt();
        double mean=mean(a,b,c,d,e,f,g,h,i,j); //Last Step: declaring mean and median outside median and mean methods so it si visible for all methods 
        double median=median(a,b,c,d,e,f,g,h,i,j);//  /\
                                        //           /--\
                                                //    ||
        result( median,  mean); //return always unles it is a void method
        
    }
        public static double median(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){ // we have do redeclare all the inputs every time there is a new method
            double median=(e+f)/2.0; //since we have a known number of inputs we don't use an equation
            return median; //return always needed
    }
        public static double mean(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
            double mean=(a+b+c+d+e+f+g+h+i+j)/10.0;//same as median method
            return mean;
    }
        public static void result(double median, double mean){ //last method "void" method, does not require a "return" statement
                                                                //however, it still requires declaration of variables
        System.out.println("The median is"+median);
        System.out.println("The mean is"+mean);
        }
}
