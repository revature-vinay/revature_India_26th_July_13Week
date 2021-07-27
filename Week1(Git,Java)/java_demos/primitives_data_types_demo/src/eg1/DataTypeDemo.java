package eg1;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		int x = 1000;
		System.out.println("x = "+x);
		
		float f1=23.44f;
		System.out.println("value of f1 = "+f1);
		
		long contact=1234567890L;
		System.out.println("Contact : "+contact);
		
		
		boolean b=false;
		System.out.println(b);
		
		
		int m=10000;
		long r=m;//implicit
		System.out.println("r = "+r);
		double s =m;//implicit
		System.out.println("s = "+s);
		float p=m;//implicit
		System.out.println("p = "+p);
		
		
		float c=21.899889f;
		System.out.println("c = "+c);
		double k=c; //implicit
		System.out.println("k = "+k);
		
		
		int o=100;
		char t=(char)o; //explicit
		System.out.println("t = "+t);
		
		double j=23.33;
		o=(int) j;//explicit
		System.out.println("o = "+o);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
//		int y=0;
//		boolean g=(boolean)y;
		
		

	}

}
