//////////////////////////////////////////////////////////////////////////////
//Dmitriy Kim
//Interest rate calc

public class Interest rate {

public static void main(String[] args) {
{
    Scanner scanner = new Scanner(System.in);
    
    System.err.println("Enter principle amount:");
    float amount = scanner.nextFloat();
    
    System.err.println("Enter time in years: ");
    float time = scanner.nextFloat();
    
    System.err.println("Enter rate annually:");
    float rate = scanner.nextFloat();
    
    float interest = simpleInterest(amount, rate, time);
    
    System.out.println("Simple interested calculate by program is : " + interest);
}
 
 public static float simpleInterest(float principle, float rate, float time){
     float interest = (principle*rate*time)/100;
     return interest;
 }
 
