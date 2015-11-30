import java.util.*;


public class RefractFacts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		int h = s.nextInt();
		int x = s.nextInt();
		double n1 = s.nextFloat();
		double n2 = s.nextFloat();
		double phiRad = 0;
		double phi = 0;
		double rightHand = 0;

		while(d != 0 && h != 0 && x != 0 && n1 != 0 && n2 != 0) {

			double max = Double.MAX_VALUE;
			double solution = 0;
			double leftHand = n1 / n2;
			
			for(phi = 0; phi <= 90; phi += 0.01) {
				
				phiRad = Math.toRadians(phi);
				double tan = Math.tan(phiRad);
				double one = (d / tan);
				double xminusdsquared = Math.pow((x - one), 2);
				double numerator = Math.sqrt(xminusdsquared + Math.pow(h, 2));		
				double xminusd = x - one;
				double other = Math.sqrt((Math.pow(d, 2)) / Math.pow(tan, 2) + Math.pow(d, 2));
				rightHand = one * (numerator / (xminusd * other));

				double error = Math.abs(leftHand - rightHand);

				if(error <= max) {
					solution = phi;
					max = error;
				}
			}
			
			d = s.nextInt();
			h = s.nextInt();
			x = s.nextInt();
			n1 = s.nextFloat();
			n2 = s.nextFloat();
			System.out.printf("%.02f\n", solution);
		}

	}

}
