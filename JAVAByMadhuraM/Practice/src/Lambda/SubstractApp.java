package Lambda;
import java.util.*;
public class SubstractApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		Subtract sub1=(a,b)-> a-b;          //Create the lambda function for Subtraction
		System.out.println(sub1.sub(sc.nextInt(),sc.nextInt()));
		}
	}


