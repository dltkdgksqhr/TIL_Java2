package sec04.exam02_generic_method;

public class Util {
  public static <K,V> boolean compare(Pare<K,V> p1,Pare<K,V> p2) {
   boolean keyCompare = p1.getKey().equals(p2.getKey());
   boolean valueCompare = p1.getValue().equals(p2.getValue());
   return keyCompare && valueCompare;
	  
  }
}
