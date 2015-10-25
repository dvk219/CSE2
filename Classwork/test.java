import java.util.Scanner;

public class test{
     public static void main(String args[]){
          Scanner myscanner = new Scanner(System.in);
          int a =myscanner.nextInt();
          int b =myscanner.nextInt();
          int test = mult(a,b);
          System.out.print("="+test);
          
     }

public static int mult(int x, int y){
          int a=1;
          
  for(int i=y;i!=x-1;i--)
  {
       a=a*i;
      System.out.print(i); 
      if(i!=x)
      {
         System.out.print("*");   
      }
  }
  
  return a;
  }
}

