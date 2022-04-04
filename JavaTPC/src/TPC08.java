
public class TPC08 {

	public static void main(String[] args) {
     int a = 30; int b=50;
     int c = add(a,b);
     System.out.println(c); // static method call
     // static 키워드는 메모리에 로딩하는 역할
	}
	
	public static int add(int a, int b) {
      int sum = a + b;
      return sum;
	}

}
