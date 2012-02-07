package chapter10;

class Exc1 {
	static void subroutine() {
		int d = 0;
		int a = 10 / d;
		System.out.println("This will not be printed. - a = " + a);
	}

	public static void main(String args[]) {
		Exc1.subroutine();
	}
}
