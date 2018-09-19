package part1_Mockito;

public interface IEmployee {
	public double computeTax( int amount );
	public double weeklySalary( Employee emp );
	public double fortnightSalary( Employee emp );
	public double computeKiwiSaver( Employee kiwiOption );
}
