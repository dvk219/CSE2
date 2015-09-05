//////////////////////////////////////////////////////////////////
//Dmitriy Kim
//September 4th
//CSE 002 
//Labo2 Cyclometer
//calculate and show the number of :minutes, counts, distance of trips.

//create a java file and give the class type and main method

public class Cyclometer {
    //main method requireded for every java program
    public static void main(String[] args) {
    
    
    // we input the number of seconds and couts in each trip
        
    int secsTrip1=480;   // number of seconds in 1st trip
    int secsTrip2=3220;   //number of seconds in the 2nd trip
    int countsTrip1=1561;   // number of counts in the 1st trip
    int countsTrip2=9037;   //number of counts in the 2nd trip
    //state variables of the wheel.
  
    double wheelDiameter=27.0; // 2xradius
    double PI=3.14159; //the number of Pi
    int feetPerMile=5280; //the number of feet per mile for conversion
    int inchesPerFoot=12; // for conversion of inches to foot, as we measure the diameter of the wheel in inches
    int secondsPerMinute=60; // since the result must be in minutes
    double distanceTrip1, distanceTrip2, totalDistance; // the final outputs that we need to find
    
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had " +countsTrip1+" counts."); // the output of time converted to minutes and the number of counts is given
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute) +"minutes and had "+countsTrip2+" counts.");
    
    //running the calculations
    //
    //
    distanceTrip1=(countsTrip1*wheelDiameter*PI)/inchesPerFoot/feetPerMile; // the distance given in inches
    distanceTrip2=(countsTrip2*wheelDiameter*PI)/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    //Print out the output
    System.out.println("Trip1 was "+distanceTrip1+" miles");
    System.out.println("Trip2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    }
    
}