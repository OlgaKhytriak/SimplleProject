package SimpleTasks;

public class NumberCheck {
	/**
	 *  @return Check if the number is odd
	*/
	public boolean isOddNumber(int number) {
		return (number&1)==1;
	}
	/**
	 *  @return Check if the number is even
	*/
	public boolean isEvenNumber(int number) {
		return (number&1)==0;
	}
}
