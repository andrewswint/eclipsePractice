package sandbox;

public class exerciese {
	
	public static int[] flip (int[] arr) {
		for (int i = 0; i < arr.length; i ++) {
			int a = arr[i];
			int b = arr[arr.length -i -1];
			arr[i] = b;
			arr[arr.length - i - 1] = a;
		}
		return arr;
	}
	
	public static void main () {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(flip(arr));
		
	}

}
