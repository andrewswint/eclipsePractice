package sandbox;

public class exerises {
	
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int mod(int a, int b) {
		return a % b;
	}
	
	public static String sayHello(String name) {
		return "Hello " + name;
	}
	
	public static boolean isEqual(int num1, int num2) {
		return num1 == num2;
	}
	
	public static int nextEdge(int side1, int side2) {
		return (side1 + side2) - 1;
	}
	
	
	
	public static void main(String[] args) {
        
//		System.out.println(addition(2,3));
//		System.out.println(mod(3,4));
//		System.out.println(sayHello("everyone"));
//		System.out.println(isEqual(2,2));
		System.out.println(nextEdge(8,10));
		
    }
	

}
