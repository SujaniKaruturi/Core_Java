package MKT_Java;

class Test {
    static int count = 0;  // static variable

    Test() {
        count++;
        System.out.println(count);
    }
}

public class Static_Keyword {
	static void greet() {
	    System.out.println("Hello!");
	}
    public static void main(String[] args) {
        new Test(); // 1  //static variable
        new Test(); // 2
        Static_Keyword.greet();   //static method
    }
}