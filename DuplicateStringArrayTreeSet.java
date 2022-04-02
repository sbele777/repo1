package bin;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DuplicateStringArrayTreeSet {

	public static void main(String[] args) {
		String s[] = {"New York","Augsburg","NewYork","Mumbai","Munich","Tokio","Paris","Tokio","Mumbai","Rome",
				"London","Augsburg","Mumbai","New York","Frankfurt","Zurich","Munich","Prague","Amasterdam"};
		TreeSet tr = new TreeSet();
		for(String a:s)
		{
			tr.add(a);
		}
		
		Object[] m = tr.toArray();
		/*{"New York","Augsburg","NewYork","Mumbai","Munich","Tokio","Paris","Rome",
				"London",,"Frankfurt","Zurich","Prague","Amasterdam"};*/
		int cnt;
		
		for(int i=0;i<m.length;i++) 
		{
			cnt=0;
			for(int j=0;j<s.length;j++)
			{
				if((String)m[i]==s[j])
				{
					cnt=cnt+1;
					if(cnt>1)
					{
						System.out.println(m[i]); 
						break;					
					}
				}
				}
			    }

		
	}
	
	

}
