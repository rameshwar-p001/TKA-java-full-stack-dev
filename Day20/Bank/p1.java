package Day20.Bank;

public class p1 {
	double roi;
                    
    //// if we do final method it will not be override
	public final void rateOfInterest(double roi) {
		System.out.println("Final ROI value for branch " + roi);
	}
    
}
