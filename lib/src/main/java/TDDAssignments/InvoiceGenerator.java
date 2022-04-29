package TDDAssignments;

public class InvoiceGenerator {
		private static final double MINIMUM_COST_PER_KILOMETER = 1.0;
	    private static final int COST_PER_TIME =1 ;

	    public double CalculateFare(double Distance, int time){

	        return Distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
	    }
	}
	

