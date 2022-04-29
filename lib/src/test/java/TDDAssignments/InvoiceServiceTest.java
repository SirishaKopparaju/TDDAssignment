package TDDAssignments;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;


public class InvoiceServiceTest {

	InvoiceGenerator invoiceGenerator=null;
	private int time;
	private double Distance;
	
	@Before
	public void setup() throws Exception{
		invoiceGenerator =new InvoiceGenerator();
		
	}
	
	@Test
    public void givenDistanceAndTime_ShouldReturn(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double Distance=2.0;
        int time=5;
       double fare= invoiceGenerator.CalculateFare(Distance,time);
       Assert.assertEquals(25, fare, 0.0);



    }
	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double Distance=0.1;
        int time=1;
       double fare= invoiceGenerator.CalculateFare(Distance,time);
       Assert.assertEquals(5, fare, 0.0);

    }
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        Ride[] rides= {new Ride(2.0,5),
        		       new Ride(0.1,1)	
        		       };
      double fare= invoiceGenerator.CalculateFare(Distance,time);
      Assert.assertEquals(30, fare, 0.0);

}
	@Test
	public void givenDistanceAndTime_ShouldReturnInvoiceSummary(){
	 
        Ride[] rides= {new Ride(2.0,5),
        		       new Ride(0.1,1)	
        		       };
       InvoiceSummary summary= invoiceGenerator.CalculateFare(rides);
       InvoiceSummary exceptedSummary=new InvoiceSummary(2,3.0);
       Assert.assertEquals(exceptedSummary, summary);

}
	@Test
	  public void givenUserIdAndRides_ShouldReturnInvoiceService() {
	    String user1 = "Sirisha";
	    Ride[] rides1 = {new Ride(2.0, 5), new Ride(0.1, 1)};
	    invoiceGenerator.addRides(user1,rides1);
	    String user2 = "Kopparaju";
	    Ride[] rides2 = {new Ride(3.0, 5), new Ride(0.1, 1)};
	    invoiceGenerator.addRides(user2,rides2);
	    InvoiceSummary summary = invoiceGenerator.getInvoiceSummary(user1);
	    InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30);
	    Assert.assertEquals(expectedInvoiceSummary,summary);
	}

	
}
