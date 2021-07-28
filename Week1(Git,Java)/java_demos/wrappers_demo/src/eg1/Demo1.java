package eg1;

public class Demo1 {

	public static void main(String[] args) {

		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 500;

		Integer i4 = new Integer(100);

		System.out.println("i1 = " + i1 + " memory of i1 : " + System.identityHashCode(i1));
		System.out.println("i2 = " + i2 + " memory of i2 : " + System.identityHashCode(i2));
		System.out.println("i3 = " + i3 + " memory of i3 : " + System.identityHashCode(i3));
		System.out.println("i4 = " + i4 + " memory of i4 : " + System.identityHashCode(i4));
		System.out.println("(i1==i2) : " + (i1 == i2));
		System.out.println("(i1==i4) : " + (i1 == i4));

		System.out.println("i1.equals(i2) : " + i1.equals(i2));
		System.out.println("i1.equals(i4) : " + i1.equals(i4));
		System.out.println("i1.equals(i3) : " + i1.equals(i3));

		int x = 10000;
		i1 = x;
		System.out.println("i1 = " + i1);

		i1 = 19999;
		x = i1;
		System.out.println("x = " + x);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		String s = "990900";
		Integer j = Integer.parseInt(s); // All wrapper classes except Character will have this method
											// Wrapper.parseWrapper(stringobj)
		System.out.println("j = " + j);
		j = 98989;
		// s=j.toString();
		s = j + "";
		System.out.println("s = " + s);

		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(20));
		System.out.println(Integer.toOctalString(10));

		// compareTo(obj) - if both objects are same then it will return 0
		// if first object value is bigger than the second object it will return +ve
		// value
		// if second object value is bigger than the first object it will return -ve
		// value

		Integer m = 100;
		System.out.println("m = " + m);
		System.out.println("m.compareTo(100) : " + m.compareTo(100));
		System.out.println("m.compareTo(90) : " + m.compareTo(90));
		System.out.println("m.compareTo(1000) : " + m.compareTo(1000));

		Float f = m.floatValue();
		System.out.println("f = " + f);

		f = 9090.9999f;
		m = f.intValue();

		System.out.println("m = " + m);

	}
//Try the same with Long, Float and Double
}
