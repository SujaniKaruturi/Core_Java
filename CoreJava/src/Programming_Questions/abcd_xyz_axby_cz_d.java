package Programming_Questions;

public class abcd_xyz_axby_cz_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//output: axbyczd
		String f="abcd";
		String g="xyz";
		String output = "";
		for(int i=0,j=0;i<f.length() && j<g.length();i++,j++)
		{
		  output =output+ f.charAt(i)+g.charAt(j);
		}
		System.out.println(output);
		

	}

}
