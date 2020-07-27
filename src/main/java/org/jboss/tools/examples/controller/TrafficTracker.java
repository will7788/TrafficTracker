// import java.util.ArrayList;

public class TrafficTracker {

	public static void main(String[] args) {
		/* if sensor trips, update store count based on where from.
		 * this code may be moved to a new logic bean*/
		int storeCount = 0;
		CustomerDao customerDao = new CustomerDao();
		// ArrayList<Customer> queue = customerDao.generateQueue(); // IoT modeling method
		
		// trip the sensor as customers "enter"
		Sensor entranceSensor = new Sensor();
		Sensor exitSensor  = new Sensor();
		
		// random number less than total in queue enter
		int numCustomersEnter = customerDao.numEnter();
		for (int i=0; i<numCustomersEnter; ++i){
			entranceSensor.trip();
			storeCount++;
			System.out.println("Entrance Sensor tripped");
			entranceSensor.reset();
		}
		System.out.println(numCustomersEnter+" customers have entered. Store count is "+storeCount);
		
		// random number less than total in store leave
		int numCustomersLeave = customerDao.numLeave();
		for (int i = 0; i<numCustomersLeave; ++i) {
			exitSensor.trip();
			storeCount--;
			System.out.println("Exit sensor tripped");
			exitSensor.reset();
		}
		System.out.println(numCustomersLeave+" customers have left. Store count is "+storeCount);

	}

}
