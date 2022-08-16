package week7;

public class BaseClass extends Utility {
	
	public BaseClass(String name) {
		super(name);
	}
	
	// we have to satisfy the utility class  , we need to provide value
	 public void fromBaseClass() {
		 System.out.println("It is form base class");
	 }

}
