package chapter8;

//Demonstrate when constructors are called.
class CallingCons {

	// Create a super class.
	static class A {
		A() {
			System.out.println("Inside A's constructor.");
		}
	}

	// Create a subclass by extending class A.
	static class B extends A {
		B() {
			System.out.println("Inside B's constructor.");
		}
	}

	// Create another subclass by extending B.
	static class C extends B {
		C() {
			System.out.println("Inside C's constructor.");
		}
	}

	public static void main(String args[]) {
		C c = new C();
		c.getClass();
	}
}