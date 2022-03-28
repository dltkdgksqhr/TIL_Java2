package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
	 List<String> str = Arrays.asList("신용권","홍길동","감자바");
	 for(String name:str) {
		 System.out.println(name);
	 }
	 
	 List<Integer> num = Arrays.asList(1,2,3,4);
	 for(int value:num) {
		 System.out.println(value);
	 }

	}

}
