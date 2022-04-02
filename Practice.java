package bin;

public class Practice {

	public static void main(String[] args) {
		/*
		String str ="aaahhhdgdjdklld";
		char c[] = str.toCharArray();

		TreeSet tr = new TreeSet();
		for(char a:c)
		{
			tr.add(a);
		}
		
		ArrayList al = new ArrayList(tr);
		Object[] m = al.toArray();
		int cnt;
		for(int i=0;i<m.length;i++) // comparing object array 'm' and char array 'c'
		{
			cnt=0;
			for(int j=0;j<c.length;j++)
			{
				if((char)m[i]==c[j])
				{
					cnt=cnt+1;
					if(cnt>1)
					{
						System.out.println(m[i]); 
						break;					//Breaking if duplicate element found
					}
				}
				}
			    }
		
		String str ="aaahhhdgdjdklld"; //aaa,hhh,d,g,d,j,d,klld
		char c []= str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

		for(char ch:c)
		{
		if(hm.containsKey(ch))
		{
		hm.put(ch,hm.get(ch)+1);
		}
		else
		{
		hm.put(ch,1);
		}
		}

		for(char m:hm.keySet())
		{
		if(hm.get(m)>1)
		{
		System.out.println(m+":"+hm.get(m));
		}
		}
		
		String s1 = "Hey you stop there";
		
		String sc[] = s1.split(" ");
		
		String s2 = "";
	
		for(int i=sc.length-1;i>=0;i--)
		{
			StringBuilder sb = new StringBuilder(sc[i]);
			
			s2=s2+" "+sb.reverse();
		}
		
		System.out.println(s2.trim());
		
		
		
		String y ="hkjb123!@$%^llkjh#__-*lm";
		y = y.replaceAll("[!@#$%^&*()-__]", "");
		System.out.println(y);
		
		
		
		String s = "@sshsuss&54545jshdhjshd654874dw8%@%@%xlde!&H@U@&HUEY3154545454DDWDWD5cd"
				+ "fd@W%@W%ss5d5ssdsbshsd44sgdddhdbdshdshdgdhdhsdbsdsdsbdf@W@$@%$@!%@$!%$@%!xc4sc1scs7scs4";
		
		s = s.replaceAll("[!@#$%^&*]", "");
		
		System.out.println(s);
		
		String s1 = "@sshsuss&54545jshdhjshd654874dw8%@%@%xlde!&H@U@&HUEY3154545454DDWDWD5cd"
				+ "fd@W%@W%ss5d5ssdsbshsd44sgdddhdbdshdshdgdhdhsdbsdsdsbdf@W@$@%$@!%@$!%$@%!xc4sc1scs7scs4";
		
		s1 = s1.replaceAll("[^A-Z]", "");
		System.out.println(s1);
		s1 = s1.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(s1);
		
		
		
		boolean indicator = true;
		for(int a=1;a<=100;a++){
		if(a!=1){
		for(int i=2;i<a;i++)
		{
		if(a%i==0)
		{
		indicator = false;
		break;
		}
		}
		if(indicator)
		{
			System.out.println(a);
		}
		indicator =true;
		
		
		
	
		}
		}
		
		
		
		
		String sen = "I will make you an offere that you can't refuse";
		
		int cnt=0;
		for(int i=0;i<sen.length();i++)
		{
			char c = sen.charAt(i);
			if(c==' ')
			{
				cnt=cnt+1;
			}
		}
		
		System.out.println(cnt);
		*/
		
		
		
		
		
		
		String sen = "I will make you an offere that you can't refuse";
		
		StringBuilder sb = new StringBuilder(sen);
		
		System.out.println("Original String: "+sen);
		
		System.out.println();
		
		System.out.println("Reversed String: "+sb.reverse());
	}
}
