package bin;

public class StrindSwapping {

	public static void main(String[] args) {
		String s1 = "Captain";
		String s2 = "America";
		
		System.out.println("Before Swapping");
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		s1 = s1.concat(s2);
		s2 = s2.concat(s1);
		s1 = s1.replace("Captain", "");
		System.out.println("");
		System.out.println("After Swapping");
		System.out.println("S1 : "+s1);
		
		
		s2 = s2.replace("America", "");
		System.out.println("S2 : "+s2);
		
		
	}

}
