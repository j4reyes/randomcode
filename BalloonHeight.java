import java.lang.Math; 
import java.util.Scanner;
class BalloonHeight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int humidity = input.nextInt();
int maxHours = input.nextInt();
for(int t=1;t<=maxHours;t++){
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