package Java;

import java.util.Scanner;

public class CheckArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Number");
		Scanner scan = new Scanner (System.in);
		int number = scan.nextInt();
		scan.close();
		int original = number;
		int temp;
		int check =0;
		while (number>0) {
			temp = number%10;
			check=check+(temp*temp*temp);
			number = number/10;
		}
		
		if (original == check)
			System.out.println("its an armstrongnumber");
		else
			System.out.println("not an armstrongnumber");
		
		
		
		
	}

}
