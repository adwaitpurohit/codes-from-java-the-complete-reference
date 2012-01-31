package chapter8;

/* In a class hierarchy, private members remain
 private to their class.
 This program contains an error and will not
 compile.
 */

class Access {

	// Create a superclass.
	static class A {
		int i; // public by default
		private int j; // private to A

		void setij(int x, int y) {
			i = x;
			j = y;
		}

		void show() {
			System.out.println(i + j);
		}
	}

	// A's j is not accessible here.
	static class B extends A {
		int total;

		void sum() {
			// total = i + j; // ERROR, j is not accessible here
		}
	}

	public static void main(String args[]) {
		B subOb = new B();
		subOb.setij(10, 12);
		subOb.sum();
		System.out.println("Total is " + subOb.total);
	}
}
