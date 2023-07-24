package Java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//153
		//123
				
		int n = 370;
		int temp = n;
		int r,sum=0;
		
		while(n>0)
		{	
		r=n%10;
		n=n/10;
		sum = sum + r*r*r;
		}
		
		if (temp == sum)
		System.out.println("Its an armstrong number");
		else
			System.out.println("Not an armstrong number");
		
	}

}
