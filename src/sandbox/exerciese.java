package sandbox;

import java.util.Arrays;

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

public static void main (String[] args) {
	
	
//	for (int i = 0; i < array.length; i ++) {
//		System.out.println(array[array.length - i - 1]);
//	}

//	System.out.println(Arrays.toString(array));
	
//	System.out.println(array[array.length - 1]);
	
//	flip(array);
	
	
//	System.out.println(Arrays.toString(flip(array)));
	
//	for (int i = 0; i < array.length - 1; i ++) {
//	      int a = array[i];
//	      int b = array[array.length -i -1];
//	      array[array.length - i - 1] = a;
//	      array[i] = b;
//	      System.out.println(array[i]);
//	  }
//
//	System.out.println(Arrays.toString(array));
	
	int[] array = {1,2,3,4,5};
	
	for (int i = 0, j = array.length - 1; i < array.length - 1 && j >= 0; i++, j--) {
	int a = array[i];
	int b = array[j];
	array[i] = b;
	array[j] = a;
	}
	
	System.out.println(Arrays.toString(array));
	
}
}
