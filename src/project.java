
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double item1 = 45.4;
		double item2 = 43.6;
		double item3 = 54.6;
		
		final double GST = 0.18;
		
		double total = item1 + item2 + item3;
		double final_price = total + (total * GST);
		
		System.out.println("===== Bill =====");
		System.out.println("item1: " + item1);
		System.out.println("item2: " + item2);
		System.out.println("item3: " + item3);
		System.out.println("total: " + total);
		System.out.println("GST 18%: "+ (total * GST));
		System.out.println("Need to be paid: " + final_price);
	}

}
