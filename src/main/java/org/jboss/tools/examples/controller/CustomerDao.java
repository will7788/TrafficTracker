import java.util.ArrayList;

public class CustomerDao {
	private int min = 0;
	private int max = 30;
	private int numCustomers;
	private int numEnter;
	private int numLeave;
	
	public ArrayList<Customer> generateQueue(){
		ArrayList<Customer> queue = new ArrayList<Customer>();
		// generate customers (if only it were so easy)
		numCustomers = (int)(Math.random() * (max - min + 1) + min); // generates within min-inclusive and max-exclusive values
		
		// this should dump into an SQL database in future iterations
		for (int i = 0; i<numCustomers; ++i) {
			queue.add(new Customer(i));
		}
		
		return queue;
}
	public int numEnter() {
		numEnter = (int)(Math.random() * (numCustomers - min + 1) + min);
		return numEnter;
	}
	public int numLeave() {
		numLeave = (int)(Math.random() * (numEnter - min + 1) + min);
		return numLeave;
	}
	
	public ArrayList<Customer> getAllCustomers(){
		ArrayList<Customer> customerArrList = new ArrayList<Customer>();
		
		// call to SQL database here
		// SQL GET 
		
		return customerArrList;
	}
	
}
