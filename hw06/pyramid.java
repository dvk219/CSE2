/////////////////////////////////////////////////////////////////
//Dmitriy V. Kim
//hw06
//build a program that builts a pyramid with 
import java.util.Scanner; //improting scanner
public class pyramid{  //creagin class
 
    public static void main(String args[]) //main method
    {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Eneter the number of rows:");
        
       int a = myscanner.nextInt(); //creating the input for rows
        for( int i=0; i<a; i++){ //stating condition so number of spaces does not exceed input
            for(int j=i; j<a; j++){ //creating condition for spaces
            System.out.print(" "); 
            }
            for(int k=(a-i); k<a;k++){ //creating condition for stars
            System.out.print("*");
            }
            //now we do the mirrow side
            System.out.print("*");
            for(int l=(a-i); l<a;l++){
                System.out.print("*"); 
                
            
        }
        
        System.out.println("");
    }
    }
}
        
  