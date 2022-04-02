package bin;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringHashMap {

	public static void main(String[] args) {
		/*
		String s[] = {"New York","Augsburg","Kolhapur","New York","Mumbai","Munich","Tokyo","Paris","Tokyo","Mumbai","Rome",
				"London","Augsburg","Mumbai","New York","Frankfurt","Zurich","Munich","Prague","Amasterdam",
				"Kolhapur","Perth","Melbourn","Kolhapur"};
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(String a:s)
		{
			if(hmap.containsKey(a))
			{
				hmap.put(a, hmap.get(a)+1);
			}
			else
			{
				hmap.put(a, 1);
			}
		}
		System.out.println(hmap);
		Set<String> keys = hmap.keySet();
		System.out.println(keys);
		for(String s1:keys)
		{
			if(hmap.get(s1)>1)
			{
				System.out.println(s1+"    :"+hmap.get(s1));
			}
		}
		*/
		
		
		String s[] = {"New York","Augsburg","Kolhapur","New York","Mumbai","Munich","Tokyo","Paris","Tokyo","Mumbai","Rome",
				"London","Augsburg","Mumbai","New York","Frankfurt","Zurich","Munich","Prague","Amasterdam",
				"Kolhapur","Perth","Melbourn","Kolhapur"};


HashMap<String,Integer> hm = new HashMap<String,Integer>();

	for(String st:s)
		{
			if(hm.containsKey(st))
				{
					hm.put(st,hm.get(st)+1); 
				}
			else
			{
				hm.put(st,1);
			}
		}

	Set<String> set = hm.keySet();
	System.out.println(set);
for(String str:hm.keySet())
	{
		if(hm.get(str)>1)
{
System.out.println(str+" : "+hm.get(str));
}
}
		

	}

}
