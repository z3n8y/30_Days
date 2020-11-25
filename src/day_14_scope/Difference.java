package day_14_scope;

public class Difference {
	private int[] elements;
	public int maximumDifference;
	
	Difference(int[] elements){
		this.elements = elements;
	}
	
	public void computeDifference() {
		int max = 0;
		for (int i = 0; i < this.elements.length; i++) {
			for(int n = 0; n < this.elements.length; n++) {
				//System.out.println("|" + elements[i] + " "+ elements[n] + "| = " + ( Math.abs(elements[i] - elements[n])));
				if (max < Math.abs(elements[i] - elements[n])) {
					max = Math.abs(elements[i] - elements[n]);
				}
			}
			
		}
		this.maximumDifference = max;
	}
	/*
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 5;
		
		Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}
	*/
	
}
