package custom_exception_eg;

public class PresenterMain {

	public static void main(String[] args) {
		
		
		BusinessValidation b1=new BusinessValidation();
		try {
			if(b1.isValidAge(34)) {
				System.out.println("Age VALIDATED");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(b1.isValidPan("ABCDE1222Q")) {
			System.out.println("Pan Validated");
		}
		}catch(InvalidPanException e){
			System.out.println(e.getMessage());
		}

	}

}
