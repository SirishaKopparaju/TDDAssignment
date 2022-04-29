package TDDAssignments;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class InvoiceServiceTest {
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
       double fare= invoiceGenerator.CalculateFare(rides);
       Assert.assertEquals(30, fare, 0.0);

}
}
