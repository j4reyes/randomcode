/*
Code used to follow a Sumac Sequence, where t2 = t0 - t1 in a list of numbers.
Creator: Jacob Reyes
Source problem: https://dmoj.ca/problem/ccc11j3
*/
import java.util.*;
class SumacSequence {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int temp = 0;
int n = 0;
while(true){
    //Rearranges the variables
    temp = b;
    b = a-b;
    a = temp;
    n++;
    if(a<0){
        break;
    }
        }
System.out.println(n);
    }    
}
