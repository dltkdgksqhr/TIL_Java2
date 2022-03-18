package sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
	  Box<Integer> box1 = Util.<Integer>boxing(100);
      int value = box1.get();
      System.out.println(value);
      
      Box<String> box2 = Util.boxing("홍길동");
      String value2 = box2.get();
      System.out.println(value2);
	}

}
