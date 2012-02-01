package chapter9.p1;

//Instantiate the various classes in p1.
public class Demo {
	public static void main(String args[]) {
		Protection ob1 = new Protection();
		ob1.getClass();
		Derived ob2 = new Derived();
		ob2.getClass();
		SamePackage ob3 = new SamePackage();
		ob3.getClass();
	}
}