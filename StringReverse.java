package bin;

public class StringReverse {

	public static void main(String[] args) {
		/*String s1 = "Captain";
		String s2 ="";
		
		System.out.println("Before Reverse: "+s1);
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			s2 = s2 +s1.charAt(i);
		}
		System.out.println("");
		System.out.println("After Reverse: "+s2);*/
		
		String s1 = "Hey you stop there";
		StringBuilder sb = new StringBuilder(s1);
		
		
		System.out.println(sb.reverse());
	}

	
}
