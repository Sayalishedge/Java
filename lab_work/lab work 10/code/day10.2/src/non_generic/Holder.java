package non_generic;

//create a class Holder that can contain ANY data type in java
//(any primitive or any ref type)
public class Holder {
	private Object ref;
	public Holder(Object ref) {
		super();
		this.ref = ref;
	}
	public Object getRef() {
		return ref;
	}	
}
