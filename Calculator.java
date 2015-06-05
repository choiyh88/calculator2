public Class Calculator {
	
	public static void main(String[] args) throws Exception {
		int num1 = 1;
		int num2 = 2;
		
		new Calculator().add(num1, num2);
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
}
