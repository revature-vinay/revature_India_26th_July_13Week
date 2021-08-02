package eg1;

public class Demo1 {

	public static void main(String[] args) {

		int x = 10;
		int y = 2;
		int res = 0;
		try {
			res = x / y;
			System.out.println(args[0]);
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		} catch (NullPointerException e) {
			System.out.println("Something is null");
		}catch(Exception e) {
			System.out.println("Some other exception");
		}

		finally {
			System.out.println("Result is : " + res);
		}

		System.out.println("This is other LOC(Lines Of Code)");

	}

}
