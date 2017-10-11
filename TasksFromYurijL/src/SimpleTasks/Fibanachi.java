package SimpleTasks;

public class Fibanachi {
	private Integer[] arrayFibanachi; //array of Fibanachi numbers
	private int n; // the size of the Fibanachi's numbers set = quantity of elements in arrayFibanachi
	private Interval arrayCalculator;
	
	/**
	 *  @return percentage of odd Fibonachi numbers
	*/
	public double percentageOfOddNumbers() {///тут не працюэ
		Integer[] tempArr=arrayCalculator.oddNumbersFromStartToEnd();
		double n1=tempArr.length;
		double n2=arrayFibanachi.length;
		return n1/n2*100;
	}
	/**
	 *  @return percentage of even Fibonachi numbers
	*/
	public double percentageOfEvenNumbers() {
		Integer[] tempArr=arrayCalculator.evenNumbersFromEndToStart();
		double n1=tempArr.length;
		double n2=arrayFibanachi.length;
		return n1/n2*100;
		}
	
	/**
	 *  @return return the beggest Even number in Fibanachi set 
	*/
	public int biggestEvenNumber() {
		Integer[] tempArr=arrayCalculator.evenNumbersFromEndToStart();
		Interval newArrayCalculator=new Interval(tempArr);
				return newArrayCalculator.maxElem();
	}
	/**
	 *  @return return the beggest Odd number in Fibanachi set 
	 * 
	*/
	public int biggestOddNumber() {
		Integer[] tempArr=arrayCalculator.oddNumbersFromStartToEnd();
		Interval newArrayCalculator=new Interval(tempArr);
				return newArrayCalculator.maxElem();
	}
	/**
	 *  @return Constructor by default 
	*/
	public Fibanachi() {};
	/**
	 *  @return Constructor which builds the  array with n Fibanachi numbers 
	 * 
	*/
	public Fibanachi(int n) {
		arrayFibanachi=new Integer[n];
		if(n>1) {
			arrayFibanachi[0]=1;
			arrayFibanachi[1]=1;
		for(int i=2; i<n;i++) {
			arrayFibanachi[i]=arrayFibanachi[i-1]+arrayFibanachi[i-2];
		}
		}
		else if (1==n) arrayFibanachi[0]=1;
		else {
			System.err.println("You enter incorrect the size of set (n) ");
		System.exit(-1);
		}
		arrayCalculator	=new Interval(arrayFibanachi);
	
	}
	
	/**
	 *  @return return the array of Fibanachi numbers
	 * 
	*/
	public Integer[] getArrayFibanachi() {
		return arrayFibanachi;
	}
}
