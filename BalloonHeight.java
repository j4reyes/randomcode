/*
Code used to determine if a balloon touches the ground within a certain timeframe, with a certain level of humidity.
Creator: Jacob Reyes
Source problem: https://dmoj.ca/problem/ccc11j2
*/

import java.lang.Math; 
import java.util.Scanner;
class BalloonHeight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int humidity = input.nextInt();
int maxHours = input.nextInt();
for(int t=1;t<=maxHours;t++){
        //Checks if −6t^4 + ht^3 + 2t^2 + t is equal to 0, with inputted h and incrementally increasing t values.
        if((Math.pow(t, 4)*(-6) + (Math.pow(t, 3))*humidity + (Math.pow(t, 2))*2 + t)<=0){
            System.out.printf("%s%n%d","The balloon first touches ground at hour:",t);
            break;
        }
        else if(t == maxHours){
            System.out.println("The balloon does not touch ground in the given time.");
        }
        }
    }
}
