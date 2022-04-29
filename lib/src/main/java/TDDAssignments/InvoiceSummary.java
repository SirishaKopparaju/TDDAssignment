package TDDAssignments;

import java.util.Objects;

public class InvoiceSummary
{
	private final int numberofrides;
	private final double totalfare;
	private final double averageride;
 public InvoiceSummary(int numberofrides,double totalfare) {
	 this.numberofrides=numberofrides;
	 this.totalfare=totalfare;
	 this.averageride=this.totalfare/this.numberofrides;
 }

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	InvoiceSummary other =(InvoiceSummary) obj;
			return Double.doubleToLongBits(averageride) == Double.doubleToLongBits(other.averageride)
			&& numberofrides == other.numberofrides
			&& Double.doubleToLongBits(totalfare) == Double.doubleToLongBits(other.totalfare);
}
@Override
public String toString() {
    return "InvoiceSummary{" +
            "averageride=" + averageride +
            ", numberofrides=" + numberofrides +
            ", totalfare=" + totalfare +
            '}';
}
}

