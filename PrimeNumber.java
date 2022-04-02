package bin;

public class PrimeNumber {
	
	

	public static void main(String[] args) {
		/*
		int a = 59;
		boolean indicator = true;
		if(a!=0 && a!=1){
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
		System.out.println(a+" is prime number");
		}
		else
		{
		System.out.println(a+" not prime number");
		}
		}*/
		
		String s = "shivam";
		
		s= s.toUpperCase();
		char c[] =s.toCharArray();
		String out="";
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				out=out+c[i];
			}
		}
		System.out.println(out);

}
}