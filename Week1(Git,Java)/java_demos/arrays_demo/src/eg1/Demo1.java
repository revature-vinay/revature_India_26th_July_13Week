package eg1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
	
		int ar1[]= {12,33,11,23,4,11,12,11,12,11};
		System.out.println(ar1[0]);
		System.out.println(ar1[2]);
		
		System.out.println("Contents of array using for loop");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		System.out.println("Contents of array using for each loop");
		for(int x:ar1) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(ar1));
		
		
		int ar2[]=new int[10];
		ar2[0]=99;
		ar2[1]=100;
		ar2[2]=45;
		ar2[3]=55;
		ar2[4]=22;
		
		int n=5;
		System.out.println("Contents of ar2 using for loop");
		for (int i = 0; i < n; i++) {
			System.out.print(ar2[i]+" ");
		}
		
		int newele=1000;
		int pos=4;
		
		for(int i=n;i>pos-1;i--) {
			ar2[i]=ar2[i-1];
		}
		ar2[pos-1]=newele;
		n++;
		System.out.println("\nContents of ar2 using for loop after insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar2[i]+" ");
		}
		
		pos=1;
		
		for (int i = pos-1; i < n; i++) {
			ar2[i]=ar2[i+1];
		}
		n--;
		
		System.out.println("\nContents of ar2 using for loop after deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar2[i]+" ");
		}
		
		
	}

}
