package eg1;

public class Palidrome {

	public static void main(String[] args) {
		System.out.println(isPalindromeDetailedWay("madam"));
		int x=100;
		System.out.println(isPalindromeDetailedWay(x+""));
		System.out.println(isPalindromeDetailedWay("madame"));
		
		System.out.println(isPalindromeShortHand("madam"));
		x=101;
		System.out.println(isPalindromeShortHand(x+""));
		System.out.println(isPalindromeShortHand("madame"));
	}
	
	public static boolean isPalindromeDetailedWay(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		return s.equals(s1);
	}
	
	public static boolean isPalindromeShortHand(String s) {
		
		return new StringBuilder(s).reverse().toString().equals(s);
	}

}
