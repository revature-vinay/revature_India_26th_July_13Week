package custom_exception_eg;

public class BusinessValidation {
	
	public boolean isValidAge(int age) throws InvalidAgeException,ArithmeticException,NullPointerException {
		if(age<=0) {
			//age cannot be 0 or -ve
			throw new InvalidAgeException("Age cannot be -ve or zero");
		}
		
		if(age<18 || age>33) {
			//only users between age 18 and 33 are allowed
			throw new InvalidAgeException("Only users between age 18 and 33 are allowed");
		}
		return true;
	}

	
	public boolean isValidPan(String pan) throws InvalidPanException{
		
		if(pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			return true;
		}else {
			throw new InvalidPanException("Entered PAN "+pan+" is INVALID");
		}
	}
}
