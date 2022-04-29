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

	
}
