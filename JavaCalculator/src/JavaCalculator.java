import java.util.Scanner;
 
public class JavaCalculator {
	public static void main(String args[]){
		double p, r, t, ci;
		Scanner sc = new Scanner(System.in);
              
		
		System.out.print("Enter principle: ");
		p = sc.nextDouble();
		
		System.out.print("Enter rate: ");
		r = sc.nextDouble();
		
		System.out.print("Enter time: ");
		t = sc.nextDouble();
		
		ci = p * (Math.pow(1 + (r / 100), t));
		
		System.out.print("Compound Interest = " + ci);
                
	}
}