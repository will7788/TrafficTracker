
public class Sensor {
	private Boolean isTripped;

	public Boolean getTrip() {
		return isTripped;
	}

	public void setTrip(Boolean isTripped) {
		this.isTripped = isTripped;
	}
	
	public Sensor() {
		isTripped = false;
	}
	
	public Boolean trip() {
		isTripped = true;
		return isTripped;
	}
	
	public void reset() {
		isTripped = false;
	}
}
