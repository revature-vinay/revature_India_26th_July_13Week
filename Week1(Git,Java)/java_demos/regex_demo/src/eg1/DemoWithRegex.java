package eg1;

public class DemoWithRegex {

	public static void main(String[] args) {
		/*
		 * Regex - Regular Expression - This is the expression which we can build using some wild cards(Pattern Matching)
		 * 
		 * Some wildcards of Regex
		 * [] - represents expression
		 * ^ - represents not
		 * {} - length
		 * [0-9]{5} - any digit of length 5
		 * [a-z]{4} - any lowercase letters or word of length 4
		 * [a-zA-Z]{10} - any word of any case of length 10
		 * [0-9]{1,4} - any digit of min 1 and max of 4 length
		 * [0-9]{1,} - min 1 and max is any
		 * [^a-zA-Z0-9]  - anything else apart from alphanumeric
		 */
		
		System.out.println(isValidPan("fsfsdfdsfdsfds"));
		System.out.println(isValidPan("ABEDA6781Q"));
		System.out.println(isValidPan("ABEDA67811"));
		System.out.println(isValidPan("ABEDA6781q"));
		System.out.println(isValidPan(null));
		
		String s="HE!!() h  a h  89 *> oo 8k9eO";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[^A-Z]", ""));
		System.out.println(s.replaceAll("[ a-zA-Z0-9]", ""));


	}
	
	public static boolean isValidPan(String pan) {
		
		return pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

}
