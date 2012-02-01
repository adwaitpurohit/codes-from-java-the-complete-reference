package chapter9;

class TestIface2 {
	public static void main(String args[]) {
		chapter9.Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		c.callback(42);
		c = ob; // c now refers to AnotherClient object
		c.callback(42);
	}
}
