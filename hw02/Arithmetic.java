///////////////////////////////////////////////////////////
//Dmitriy Kim
// Homework 2
// Arithmetic

//define a class
public class Arithmetic{

// add main method
    public static void main(String[] args){

//SOCKS
   
    // number off pairs of socks
    int nSocks=3;
    // Cost per pair of socks
    //('$' is a part of the variablename)
    double sockCost$=2.58;
    //calculate cost of socks with no tax
    double totalsockCostNoTax$=2.58*3;
    System.out.println("Total cost of sock no tax $" +totalsockCostNoTax$);
    
    // calculating the total tax
    double taxPercent=0.06;
    double Sockstax$=2.58*3*0.06;
       System.out.println("Total tax for sock is $" +Math.round(Sockstax$*100.0)/100.0);
    //calculating the total cost
    double totalsockCostWithTax$=(2.58*3)*0.06+2.58*3;
    System.out.println("Total cost of socks with tax is $" +Math.round(Sockstax$*100.0)/100.0);
    
//DRINKING GLASSES
    
// number of drinking glasses
    int nGlasses=6;
//Cost per glass
    double glassCost$=2.28;
//calculate total cost of glasses no tax
    double totalGlassNoTax$=glassCost$*nGlasses;
    System.out.println("Total cost of drinking glasses no tax is $" +Math.round(totalGlassNoTax$*100.0)/100.0);
//calculate tax for glasses
    double glassTax$=2.28*6*taxPercent;
    System.out.println("The tax for drinking glasses is $" +Math.round(glassTax$*100.0)/100.0);
// calculating total cost of glasses with tax
    double totalGlassesCostWIthTaxes$=2.28*6+glassTax$;
    System.out.println("The total drinking glasses cost with tax is $" +Math.round(totalGlassesCostWIthTaxes$*100.0)/100.0);
    
//ENVELOPES
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
// total cost of envelopes no tax
    double totalEnvelopesNoTax$=nEnvelopes*envelopeCost$;
    System.out.println("The total cost of envelopes no tax is $" +Math.round(totalEnvelopesNoTax$*100.0)/100.0);
//tax for envelopes 
    double envelopesTax$=totalEnvelopesNoTax$*taxPercent;
    System.out.println("Total tax for envelopes is $" +Math.round(envelopesTax$*100.0)/100.0);
//total envelopes cost with tax
    double envelopesTotalWithTax$=envelopesTax$+totalEnvelopesNoTax$;
    System.out.println("The total cost of envelopes with tax is $" +Math.round(envelopesTotalWithTax$*100.0)/100.0);

//TOTAL

    //Total cost with no tax 
    double totalCostNoTax$=totalsockCostNoTax$+totalGlassNoTax$+totalEnvelopesNoTax$;
    System.out.println("The total cost with no tax is $" +Math.round(totalCostNoTax$*100.0)/100.0);

//Total cost with tax
    double totalCost$=totalsockCostWithTax$+totalGlassesCostWIthTaxes$+envelopesTotalWithTax$;
    System.out.println("The total cost wtih taxes is $" +Math.round(totalCost$*100.0)/100.0);
    
        
    }
    
}