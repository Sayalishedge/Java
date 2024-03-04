package generic;

//create a class Holder that can contain ANY data type in java
//(any primitive or any ref type)
public class Holder<T> //generic class , of type T : type allows for ref type 
{
	private T ref;
	public Holder(T ref) {
		super();
		this.ref = ref;
	}
	public T getRef() {
		return ref;
	}	
}
