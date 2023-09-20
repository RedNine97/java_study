package j1223;

import java.util.ArrayList;

public class ArrayListTest<T>{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ArrayList<String> alt = new ArrayList<String>();
		
		alt.add("오렌지");
		alt.add("딸기");
		alt.add("복숭아");
		
		System.out.println("list.size()=> "+alt.size());
		
		for(String ss:alt) {
			System.out.println(ss);
		}
	}

}
