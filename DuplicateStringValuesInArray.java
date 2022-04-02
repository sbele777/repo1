package bin;

import java.util.LinkedHashSet;

public class DuplicateStringValuesInArray {

	public static void main(String[] args) {
		String s[] = {"New York","Augsburg","NewYork","Mumbai","Tokio","Paris","Tokio","Mumbai","Rome","London","Augsburg","Mumbai"};
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		int cnt;
		Object m[] = set.toArray();  
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
