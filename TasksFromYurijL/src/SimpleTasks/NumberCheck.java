package SimpleTasks;

public class NumberCheck {
	/**
	 *  @return Check if the number is odd
	*/
	public boolean isOddNumber(int number) {
		if(0!=number%2) return true;
		else return false;
	}
	/**
	 *  @return Check if the number is even
	*/
	public boolean isEvenNumber(int number) {
		if(0==number%2) return true;
		else return false;
	}
}
