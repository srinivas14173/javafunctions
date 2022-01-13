package functions;

public class NoArgumentNoReturn {

	public static void main(String[] args) {
		NoArgumentNoReturn obj1=new NoArgumentNoReturn();
		obj1.calculate();

	}
	void calculate() {
		int qty=5;
		double price=45.5;
		double total;
		total=price*qty;
		System.out.println("Total price:"+total);
		
	}

}
