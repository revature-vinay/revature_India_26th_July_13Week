package eg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> input=new ArrayList<>(Arrays.asList("cat","tac","toe","eat","jam","maj","train","raint","act"));
		
		//cat tac act
		//toe
		//eat
		//jam maj
		//train raint
		findAnagaramGroup(input);

	}
	
	public static void findAnagaramGroup(List<String> input) {
		List<List<String>> output=new ArrayList<>();
		
		for(int i=0;i<input.size();i++) {
			List<String> result=new ArrayList<>();
			result.add(input.get(i));
			char ar1[]=input.get(i).toCharArray();// c,a,t
			Arrays.sort(ar1);//a,c,t
			for (int j = i+1; j < input.size(); j++) {
				char ar2[]=input.get(j).toCharArray();// t,a,c
				Arrays.sort(ar2);// a,c,t
				if(Arrays.equals(ar1, ar2)) {
					result.add(input.get(j));
				}
			}
			input.removeAll(result);
			i--;
			output.add(result);
		}
		System.out.println(output);
	}

}
