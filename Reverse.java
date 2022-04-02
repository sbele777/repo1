package bin;

public class Reverse {

	public static String out(String s)  //s=java
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)   //i=0
		{
			rev = rev+s.charAt(i);             //charAt(0) = j            rev=avaj
		}
		return rev;
		
	}
	
	public static void main(String[] args) {
		String s = "We are learning Java";
		String [] s1 = s.split(" ");  //{We ,are, learning, Java}
		String FinalString="";
		for(int i=s1.length-1;i>=0;i--)  //i=2
		{
			FinalString = FinalString +" "+ out(s1[i]);   //s1[2]=learning        FinalString = avaj gninrael era eW
		}									//gninrael
		
		System.out.println(FinalString.trim());

	}

}
