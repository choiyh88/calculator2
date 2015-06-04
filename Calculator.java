
public Class Calculator {
	
	public static void main(String[] args) throws Exception {
		int a = 1;
		int b = 2;
		
		new Calculator().add(a, b);
	}
	
	public int add(int a, int b) {
		return a + b;
	}
}
