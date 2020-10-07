package JavaCoding;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int temp;
		temp =n;
		int a,c=0;
		
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) 
			System.out.println("No is armstrong no");
			else 
			System.out.println("No is not armstrong no");
			}
		
	}


