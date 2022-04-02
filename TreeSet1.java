package bin;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class TreeSet1 {

	public static void main(String[] args) {
		int ar [] = {12,12,55,88,66,88,44,755,6666,888,87988,1,1,1,2,2,2};
		
		TreeSet tr = new TreeSet();
		for(int num:ar)
		{
			tr.add(num);
		}
		tr.add(80);
		tr.add(100);
		
		
		Object[] f = tr.toArray();
		System.out.println(f[f.length-2]);
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
		ArrayList<Integer> asd = new ArrayList<Integer>();
		asd.add(4);
		asd.add(2);
		asd.add(3);
		asd.add(1);
		asd.add(4);
		System.out.println(asd);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int a:ar)
		{
			set.add(a);
		}
		System.out.println(set);
	}


}
