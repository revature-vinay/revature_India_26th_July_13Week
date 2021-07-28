package eg1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		System.out.println("s1 = " + s1 + " s1 memory is " + System.identityHashCode(s1));
		System.out.println("s2 = " + s2 + " s2 memory is " + System.identityHashCode(s2));
		System.out.println("s3 = " + s3 + " s3 memory is " + System.identityHashCode(s3));

		s3 = s3.intern(); // brings this object back to common pool
		System.out.println("s3 = " + s3 + " s3 memory is " + System.identityHashCode(s3));

		System.out.println("s3.equals(\"hello\") : " + s3.equals("hello"));
		System.out.println("s3.equals(\"hey\") : " + s3.equals("hey"));
		System.out.println("s3.equals(\"Hello\") : " + s3.equals("Hello"));
		System.out.println("s3.equalsIgnoreCase(\"HelLo\") : " + s3.equalsIgnoreCase("HelLo"));

		System.out.println("s3.length() : " + s3.length());

		System.out.println("s3.charAt(1) : " + s3.charAt(1));

		for (int i = 0; i < s3.length(); i++) {
			System.out.println("charAt(" + i + ") :  is " + s3.charAt(i));
		}

		char c[] = s3.toCharArray();
		System.out.println(Arrays.toString(c));

		System.out.println("s3.contains(\"e\") : " + s3.contains("e"));
		System.out.println("s3.contains(\"ell\") : " + s3.contains("ell"));
		System.out.println("s3.contains(\"lol\") : " + s3.contains("lol"));

		System.out.println("s3.substring(1) : " + s3.substring(1));
		System.out.println("s3.substring(1,4) : " + s3.substring(1, 4));

		String s5 = "hello hi good afternoon, I know that you know java, but please be patient";
		String s6[] = s5.split(" ");
		for (int i = 0; i < s6.length; i++) {
			System.out.println(s6[i].toUpperCase());
		}
		String s7="           heyyyy I am message                      ";
		System.out.println(s7);
		s7=s7.trim();
		System.out.println(s7);
		
		System.out.println(s7.startsWith("he"));
		System.out.println(s7.endsWith("llo"));
		
		System.out.println(s7.replace("s", "ol"));
		System.out.println(s7);
		
		System.out.println(s7.indexOf("y"));
		System.out.println(s7.lastIndexOf("y"));
		System.out.println(s7.indexOf("y", 3));

	}

}
