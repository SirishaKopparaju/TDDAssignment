package TDDAssignments;

public class InvoiceGenerator {
		private static final double MINIMUM_COST_PER_KILOMETER = 10;
	    private static final int COST_PER_TIME =1 ;
	    private static final int MIN_FARE =5 ;


	    public double CalculateFare(double Distance, int time) {

	      double totalfare = Distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
	      if(totalfare<MIN_FARE)
	    	  return MIN_FARE;
	      return totalfare;
	    }
	}
	

