package part1_labExample;

public class ComputeImplementation implements ICompute {

	ICompute obj;
	
	public int squareVar( int num1 ) {
		return obj.squareVar( num1 );
	}

	public int multiply( int num1, int num2 ) {
		return obj.multiply( num1, num2 );
	}

	public void setObj(ICompute obj) {
		this.obj = obj;
	}
	
}
