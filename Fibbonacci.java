package bin;

public class Fibbonacci {

	public static void main(String[] args) {
		int a =0;
		int b =1;
	
		System.out.print(b+" ");
		int res =0;
		for(int i=1;i<=100;i++)
		{
			res = a+b;
			a =b;
			b=res;
			System.out.print(res+" ");
		}

	}

}
