// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n =Integer.parseInt(args[0]);
		String str=args[1];
		int count=0;
		int num;
		if (str.equals("v")) {
			for (int i=1;i<n+1;i++)
		{
			count=0;
			if (i%2!=0) {
				System.out.print(i+" ");
				count++;
				num=i*3+1;
				while (num!=1) {
					if (num%2==0) {
						System.out.print(num+" ");
						count++;
						num=num/2;
					}
					else
					{
						System.out.print(num+" ");
						count++;
						num=num*3+1;
					}
				}
				System.out.print(num+" ");
				count++;
			}
			else	
			{
				System.out.print(i+" ");
				count++;
				num=i;
				while (num!=1) {
					if (num%2==0) {
						num=num/2;
						System.out.print(num+" ");
						count++;
					}
					else
					{
						System.out.print(num+" ");
						count++;
						num=num*3+1;
					}
				}

			}
			System.out.println("("+count+")");
				
		}
	
	}
	System.out.println("Every one of the first " +n+" hailstone sequences reached 1.");
}	
		
}
