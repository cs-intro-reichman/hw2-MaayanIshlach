// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n=Integer.parseInt(args[0]);
		double sum=0.0;
		int flag=1;
		for(int i=0 ; i<n ; i++)
		{
			sum+= flag* (1.0/(i*2+1));
			flag*=-1;
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:	"+sum*4);
		

	}
}

//pi according to Java: 3.141592653589793
//pi, approximated:     3.0418396189294032