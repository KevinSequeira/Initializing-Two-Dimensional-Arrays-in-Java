// Initializing-Two-Dimensional-Arrays-in-Java
// So here's a sample program on how you can initialize Two Dimensional Arrays in the Java

public class initializingTwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double twoD[][] = {
				{0.0, 0.1, 0.2, 0.3},
				{1.0, 1.1, 1.2, 1.3},
				{2.0, 2.1, 2.2, 2.3},
				{3.0, 3.1, 3.2, 3.3},
		};
		
		int i, j;
		
		for(i = 0; i < 4; i++){
			for(j = 0; j < 4; j++){
				
				System.out.print(twoD[i][j] + "," + " ");
				
			}
			System.out.println();
		}
		
	}

}
