package functions;

public class WithArgumentNoReturn {

	public static void main(String[] args) {
		int qty=6;
		double price=45.5;
		WithArgumentNoReturn obj1= new WithArgumentNoReturn();
		obj1.calculate(7,45.5);
	}
	void calculate(int x, double pr) {
		double total;
		total=x*pr;
		System.out.println("Total:"+total);
	}

}
