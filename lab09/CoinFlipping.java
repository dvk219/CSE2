///////////////////////////////////////////////////////
//Dmitriy V. Kim
//Lab09
//flip 
import java.util.Scanner;


public class CoinFlipping{
    
public static void main(String args[]){
flip();

Scanner myscanner = new Scanner(System.in);
System.out.println("Enter number of flips between 1 and 100");
int numberofflips=myscanner.nextInt();

flip(numberofflips);
}

public static void flip(){
    
    int a =0;
    a =(int) (Math.random()*2);
    
    if(a == 1){
        
    System.out.println("You flipped Heads!");
    }else{
        
        System.out.println("You flipped Tails!");
    }
  
 
}
public static void flip(int a){
    int countheads=0,counttails=0;
    for(int i= 0;i<a; i++){
    
    int b =(int) (Math.random()*2);
    
    if(b == 1){  
    countheads+=1;
    }
    else{
    counttails+=1;
    
    }
    
    }
    System.out.println("Number of heads="+countheads);
    
    System.out.println("Number of tails="+counttails);
}
  
   
   
   
      
  }

  