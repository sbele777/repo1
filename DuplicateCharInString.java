package bin;
import java.util.LinkedHashSet;
public class DuplicateCharInString {

public void findDuplicate(String s)  //method to find duplicate elements in string
	{
		LinkedHashSet<Character> set
        = new LinkedHashSet<Character>();
		char c[] = s.toCharArray(); // Converting string to Array
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);          // adding character only once.. eliminating duplicate of any char
		}
		Object[] m = set.toArray(); // converting set into object array
		int cnt;
		for(int i=0;i<m.length;i++) // comparing object array 'm' and char array 'c'
		{
			cnt=0;
			for(int j=0;j<c.length;j++)
			{
				if((char)m[i]==c[j])
				{
					cnt=cnt+1;
					
				}
				}
			if(cnt>1)
			{
				System.out.println(m[i]+" "+cnt); 
									//Breaking if duplicate element found
			}
			    }
	}
	public static void main(String[] args) {
		
		String str ="aaahhhdgdjdklld";
		DuplicateCharInString obj = new DuplicateCharInString();
		obj.findDuplicate(str);
		}
}