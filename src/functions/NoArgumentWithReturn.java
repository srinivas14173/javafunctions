package functions;

public class NoArgumentWithReturn {
	
	public static void main(String[] args) {
		double total;
		NoArgumentWithReturn obj1= new NoArgumentWithReturn();
				total=obj1.calculate();
		System.out.println("Total value:"+total);
		

	}
	double calculate() {
		int qty=6;
		double price=45.5;
		return price*qty;
	}

}
