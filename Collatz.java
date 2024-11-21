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
						
						count++;
						num=num*3+1;
						System.out.print(num+" ");
					}
				}

			}
			System.out.println("("+count+")");
				
		}
	
	}
	System.out.println("Every one of the first " +n+" hailstone sequences reached 1.");
}	
		
}




/*
 
1 4 2 1 (4)%0A2 1 (2)%0A3 10 5 16 8 4 2 1 (8)%0A4 2 1 (3)%0A5 16 8 4 2 1 (6)%0A6 3 10 5 16 8 4 2 1 (9)%0A7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)%0AEvery one of the first 7 hailstone sequences reached 1.
1 4 2 1 (4)%0A2 1 (2)%0A3 10 5 16 8 4 2 1 (8)%0A4 2 1 (3)%0A5 16 8 4 2 1 (6)%0A6 3 3 5 5 8 4 2 1 (9)%0A7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)%0AEvery one of the first 7 hailstone sequences reached 1.

1 4 2 1 (4)%0A2 1 (2)%0A3 10 5 16 8 4 2 1 (8)%0A4 2 1 (3)%0A5 16 8 4 2 1 (6)%0A6 3 10 5 16 8 4 2 1 (9)%0A7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)%0A8 4 2 1 (4)%0A9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (20)%0A10 5 16 8 4 2 1 (7)%0AEvery one of the first 10 hailstone sequences reached 1.
1 4 2 1 (4)%0A2 1 (2)%0A3 10 5 16 8 4 2 1 (8)%0A4 2 1 (3)%0A5 16 8 4 2 1 (6)%0A6 3 3 5 5 8 4 2 1 (9)%0A7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)%0A8 4 2 1 (4)%0A9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (20)%0A10 5 5 8 4 2 1 (7)%0AEvery one of the first 10 hailstone sequences reached 1.
 */