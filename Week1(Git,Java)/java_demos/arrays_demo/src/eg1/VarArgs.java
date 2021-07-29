package eg1;

public class VarArgs {

	public static void main(String ...args) {
		// TODO Auto-generated method stub
		System.out.println(sum());
		int ar[]= {11,2,3,4};
		System.out.println(sum(ar));
		System.out.println(sum(122,1,2,4,1));
		System.out.println(sum(66));
		demo(100,"Rk","kr","rkr");

	}
	
	/*
	 *  var-args - its represented utilizing ...(3dots)
	 *  it should be the last parameter of the method
	 *  it can be 0 or any
	 *  we can have other parameters but not other parameters as var args, i.e in a method param list there can be only and only 1 var args which 
	 *  should be in the last 
	 */
	public static int sum(int ...a) {
		if(a.length==0) {
			return 0;
		}else {
			int sum=0;
			for(int x:a) {
				sum+=x;
			}
			return sum;
		}
	}
	
	public static void demo(int x,String ...d) {
		
	}

}
