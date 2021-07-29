package eg1;

public class TitlleCase {

	public static void main(String[] args) {
	
		String s="hello hi good noon hope we got thread safety";
		System.out.println(convertToTitleCase(s));

	}
	
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

}
/*
 *		Task1 - Convert every word's last letter to upper case
 *		Task2 - If the word is of odd length then convert middle letter to uppercase else convert first letter to uppercase
 *		Task3 - In every word if it is not palindrome then reverse it and print back the whole sentence.  
 */
