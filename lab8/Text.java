import java.util.Scanner;
import java.util.StringTokenizer;


public class Text {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String strng = new String(in.nextLine());

        int length = strng.length();
        
        

        StringTokenizer st = new StringTokenizer(strng, ".!?");
        System.out.println();
        System.out.print(" ");
        while(st.hasMoreTokens()){
        	String big = "";
        	String small = "                                  ";

        	String str1 = st.nextToken();
        	System.out.println(str1);
        	StringTokenizer st1 = new StringTokenizer(str1, ", ");
        	while(st1.hasMoreTokens()){
        		String word = st1.nextToken();
        		int k = 0;
        		if (word.length() == big.length()){
        			System.out.println("The biggest word: " + word);}
        		if (word.length() == small.length()){
        			System.out.println("The smallest word: " + word);}
        		if (word.length() > big.length())
        			big = word;
        		if (word.length() < small.length())
        			small = word;
        		
        	}
        	System.out.println("The biggest word: " + big);
        	System.out.println("The smallest word: " + small);
        	System.out.println();
        }

    }
}