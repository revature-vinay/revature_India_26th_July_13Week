package eg1;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		String mobileNum="+91-1234567890";
		
		if(mobileNum.matches("\\+91-[0-9]{10}")) {
			System.out.println("Valid Number");
		}else {
			System.out.println("Invalid Number");
		}

	}

}
