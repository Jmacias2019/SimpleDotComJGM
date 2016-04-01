package edu.saintjoe.cs.Jmacias2019.SimpleDotComJGM;

public class SimpleDotCom {

	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		
		
		int[] locations = {2,3,4};
		
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		
		if (result.equals("hits") ) {
			
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}
	
}
