// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String str=args[0];
            int n=Integer.parseInt(args[1]);
            String letters = "AEFHILMNORSX";
            String letters_small="aefhilmnorsx";
            String line= "";
            for (int i = 0; i <str.length(); i++)
            {
                if ((letters.indexOf(str.charAt(i))==-1)&&(letters_small.indexOf(str.charAt(i))==-1)) {
                        line="Give me a  "+ str.charAt(i)+": "+str.charAt(i)+"!";
                        System.out.println(line);

                }
                else{
                        line= "Give me an " + str.charAt(i)+": "+str.charAt(i)+"!";
                        System.out.println(line);
                }

        }
        System.out.println("What does that spell?");
        for (int i = 0; i <n; i++)
            {
                System.out.println(str.toUpperCase()+ "!!!");
            }
}
}
