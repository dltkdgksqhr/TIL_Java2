package sec03.exam01_multi_type_parameter;

public class Product<T, M> {
  private M model;
  private T kind;
public M getModel() {
	return model;
}
public void setModel(M model) {
	this.model = model;
}
public T getKind() {
	return kind;
}
public void setKind(T kind) {
	this.kind = kind;
}




  
}
