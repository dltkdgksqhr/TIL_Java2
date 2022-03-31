
public class TPC07 {

	public static void main(String[] args) {
	int a=20;
	float b=56.7f;
	float c = sum(a,b); // Call By Value(값)
	System.out.println(c);

	int[] arr = {1,2,3,4,5};
	// 배열의 총합?
	int d = arrSum(arr); // Call By Reference(번지)
	System.out.println(d);
	}

	private static int arrSum(int[] arr) {
	  int hap =0;
	  for(int i=0;i<arr.length;i++) {
		  hap += arr[i];
		  
	  }
		return hap;
	}

	private static float sum(int a, float b) {
		float c = a+b;
		return c;
	}

}
