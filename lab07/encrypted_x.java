///////////////////////////////////////
//Dmitriy Kim
//lab07
//secret X
import java.util.Scanner; //importing scanner
public class encrypted_x{
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Eneter the number");
        int i = myscanner.nextInt(); //creating scanner for next imput
        
            if((i>=0) && (i<=100)){ //1. create range for the input
                if(i%2==0){ //2. check if the input number is odd, 
                i++;//3.if not we add 1 to make it odd. odd number is required to be symetrical
                }
                for(int a =0; a<i;a++){ // creating vertical rows-a. a must not exceed the input
                    for(int b =0;b<i;b++){ // creatign horizontal rows-b. same things as vert
                if(b==a || (b==i-a-1)){ //now we create spaces for X
                                        //1. b==a statement makes spaces in the left part 
                                        //2. b==i-a-1 states spaces in the right part. Minus one shifts spaces to the right 
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                    
            
                    
                }
            
            System.out.println(""); // printLN is required to shift to the next line
                
            
         
            }
        }
            
        else{
        System.exit(-1); //when loop is done we the porgram exits
          }
    
    }
}

