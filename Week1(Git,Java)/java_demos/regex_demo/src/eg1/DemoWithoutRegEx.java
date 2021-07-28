package eg1;

public class DemoWithoutRegEx {

	public static void main(String[] args) {
		
		System.out.println(isValidPan("fsfsdfdsfdsfds"));
		System.out.println(isValidPan("ABEDA6781Q"));
		System.out.println(isValidPan("ABEDA67811"));
		System.out.println(isValidPan("ABEDA6781q"));

	}

	// 5Uppercase 4 digits and 1 uppercase letter in end

	public static boolean isValidPan(String pan) {
		boolean b = false;

		if (pan.length() == 10 && Character.isUpperCase(pan.charAt(9))) {

			int upper = 0;
			for (int i = 0; i < 5; i++) {
				if (Character.isUpperCase(pan.charAt(i))) {
					upper++;
				}
			}
			if (upper == 5) {
				int digits = 0;
				for (int i = 5; i < 9; i++) {
					if (Character.isDigit(pan.charAt(i))) {
						digits++;
					}
				}
				if (digits == 4) {
					b = true;
				}
			}
		}

		return b;
	}

}
