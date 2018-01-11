package domain;

import java.util.Random;

public class Die {
	
	private int faceVal;

	public Die() {
		
	}
	
	public int roll() {
		
		Random rand= new Random();
	
		//System.out.println(this.faceValue); for debugging

		return rand.nextInt(7-1)+1;
	}

	public int getFaceVal() {
		return faceVal;
	}
	
	
	
}
