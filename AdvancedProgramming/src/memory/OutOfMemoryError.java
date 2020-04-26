package memory;

public class OutOfMemoryError {
	public static void main(String[] args) {
		
		double[] list;
		try {
			list = new double[300000000];
		}catch(Error e) {
			e.printStackTrace();
			System.out.println("The running program has thrown an Out of Memory");
		}
	}
}
