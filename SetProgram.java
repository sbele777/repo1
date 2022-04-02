package bin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {

	public static void main(String[] args) {
		int a[] = {5,7,8,3,5,1,2,5,8,9,0};
		
		Set<Integer> set = new HashSet<Integer>();

		for(int n:a)
		{
			set.add(n);
		}
		
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Mumbai", 5);
		hm.put("Chennai", 4);
		hm.put("Rajasthan", 1);
		hm.put("Kolkata", 2);
		hm.put("Hydrabad", 2);
		hm.put("Delhi", 0);
		hm.put("Punjab", 0);
		hm.put("Banglore", 0);
		hm.put("Gujrat", 0);
		hm.put("Lakhanau", 0);
		hm.put("Mumbai", 5);
		hm.put("Lakhanau", null);
		hm.put("Lakhanau", 1);
		System.out.println(hm);
		
		Set<String> keys = hm.keySet();
		
		for(String s1:keys)
		{
			if(hm.get(s1)>1)
			{
				System.out.println(s1+" : "+ hm.get(s1));
			}
		}
		
		for(String i : hm.keySet())
		{
			if(hm.get(i)>1)
			{
				System.out.println(i+" : "+hm.get(i));
			}
		}
		
		Set<Integer> mm = new HashSet<Integer>();
		
		mm.add(90);
		mm.add(20);
		mm.add(10);
		mm.add(90);
		mm.add(10);
		mm.add(20);
		mm.add(50);
		mm.add(30);
		
		System.out.println(mm);
		
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(90);
		tr.add(20);
		tr.add(10);
		tr.add(90);
		tr.add(10);
		tr.add(20);
		tr.add(50);
		tr.add(30);
		
		System.out.println(tr);
		
		int z = 001;
		System.out.println(z);
	}
	
	

	

}
