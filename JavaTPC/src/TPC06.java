
public class TPC06 {

	public static void main(String[] args) {
   // 5. 메서드 ->  동작(method), 기능(function)
    int total = sum(10,20);
    System.out.println(total);
    
    int[] d = makeArr();
    int hap =0;
    for(int i=0;i<d.length;i++) {
     hap += d[i];
    	}
    System.out.println(hap);
	}
	   private static int[] makeArr() {
	   int[] arr = new int[3];
	   arr[0] = 10;
	   arr[1] = 20;
	   arr[2] = 30;
	   
		return arr;
	}
	// 정수 2개를 더하여 총합을 구하여 리턴하는 메서드를 정의하시오.
   public static int sum(int a, int b) {
	  int v = a +b;
	return v;
   }
  
}
