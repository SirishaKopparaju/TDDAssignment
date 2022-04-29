package TDDAssignments;

import java.util.HashMap;
import java.util.Map;

public class InvoiceGenerator {
		private static final double MINIMUM_COST_PER_KILOMETER = 10;
	    private static final int COST_PER_TIME =1 ;
	    private static final int MIN_FARE =5 ;
	    private Map<String,Ride[]> rideRepository = new HashMap<>();


	    public double CalculateFare(double Distance, int time) {

	      double totalfare = Distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
	      return Math.max(totalfare, MIN_FARE);
	    }


		public InvoiceSummary CalculateFare(Ride[] rides) {
			double totalFare=0;
			for(Ride ride:rides) {
				totalFare+=this.CalculateFare(ride.distance,ride.time);
			}
			return new InvoiceSummary(rides.length,totalFare);
			
		}
		public void addRides(String userId, Ride[] rides) {
		    rideRepository.put(userId,rides);
		  }

		  public InvoiceSummary getInvoiceSummary(String userId) {
		    Ride[] rides=rideRepository.get(userId);
		    return new InvoiceGenerator().CalculateFare(rides);
		  }
	}
	

