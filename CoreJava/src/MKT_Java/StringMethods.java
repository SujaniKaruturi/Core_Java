package MKT_Java;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= " Hyderabad ";
		String s2= " Ameenpur village";
		String s3 = "hyderabad";
		String s5 = "hyderabad";
		String s4=new String(" Hyderabad");
		String s6=new String(" Hyderabad");
		if (s4==s6)
		{
			System.out.println(" String objects are Same ");
		}
		else
		{
			System.out.println(" Not Same ");
		}
		if (s==s4)
		{
			System.out.println("Same ");
		}
		else
		{
			System.out.println(" Not Same ");
		}
		if (s3==s5)
		{
			System.out.println("Same ");
		}
		else
		{
			System.out.println(" Not Same ");
		}
		
		System.out.println("Character at  " + s.charAt(5) );
		System.out.println("compares to " + s.compareTo(s2) );
		System.out.println("compares to Ignore Case " + s.compareToIgnoreCase(s3));
		System.out.println("" + s2.concat(s) );
		System.out.println("" + s.indexOf('d') );
		System.out.println("" + s.indexOf('d', 4));
		System.out.println("" + s.indexOf('d', 4));
		System.out.println("" + s.indexOf('a', 4, 9));
		System.out.println("" + s2.lastIndexOf('e'));
		System.out.println("" + s.length());
		System.out.println("" + s.repeat(1) );
		System.out.println("" + s.replace('d','D'));
		System.out.println("" + s.replaceAll(s3, "Home"));
		System.out.println("" + s2.substring(8));
		System.out.println("" + s2.substring(4, 10));
		System.out.println("" + s.toLowerCase() );
		System.out.println("" +s2.toUpperCase() );
		System.out.println("" +  s.trim());
		System.out.println("" + s.valueOf('r'));
		System.out.println("" + s2.contains(s3));
		System.out.println("Equals to " + s.equals(s2) );
		System.out.println("Equals ignore case" + s.equalsIgnoreCase(s3) );
		
	}

}
