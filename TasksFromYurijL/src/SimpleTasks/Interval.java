package SimpleTasks;

public class Interval {
	private Integer[] interval;
	private int n;
	private NumberCheck checker=new NumberCheck();
	
	
	
	/**
	 *  @return The value of the max  element of array
	 */
	public int maxElem() {
		int max=interval[0];
		for (int i=1;i<n;i++)
			if(max<interval[i]) max=interval[i];
		return max;
	}
	/**
	 *  @return The value of the min  element of array
	 */
	public int minElem() {
		int min=interval[0];
		for (int i=1;i<n;i++)
			if(min>interval[i]) min=interval[i];
		return min;
	}
	/**
	 *  @return The sum of even numbers of interval    
	 */
	public int calcSumEvenNumbers() {
		return sumMasiv(evenNumbersFromEndToStart());
	}
	/**
	 *  @return The sum of odd numbers of the array    
	 */
	public int calcSumOddNumbers() {
		return sumMasiv(oddNumbersFromStartToEnd());
	}
	/**
	 *  @return The sum of all interval elements
	 *  @param  
	 */
	private int sumMasiv(Integer[] someArray) {
		int sum=0;
		for(int elem:someArray) {
			sum+=elem;
		}
		return sum;
	}
	/**
	 *  @return The array of the interval's odd elements
	 *  from start to the end
	 */
	public Integer[] oddNumbersFromStartToEnd() {
		int kilkistOdd=0;
		for (int i=0;i<interval.length;i++) {
			if(checker.isOddNumber(interval[i])) kilkistOdd++;
		}
		Integer[] oddInterval=new Integer[kilkistOdd];
		int indexOdd=0;
		for (int i=0;i<interval.length;i++) {
			if(checker.isOddNumber(interval[i])) {
				oddInterval[indexOdd]=interval[i];
				indexOdd++;
			}
		}
		return oddInterval;
	}
	/**
	 *  @return The array of the interval's even elements
	 *  from the end to start
	 */
	public Integer[] evenNumbersFromEndToStart() {
		int kilkistEven=0;
		for (int i=0;i<n;i++) {
			if(checker.isEvenNumber(interval[i])) kilkistEven++;
		}
		Integer[] evenInterval=new Integer[kilkistEven];
		int indexEven=0;
		for (int i=interval.length-1;i>=0;i--) {
			if(checker.isEvenNumber(interval[i])) {
				evenInterval[indexEven]=interval[i];
				indexEven++;
			}
		}
		return evenInterval;
	}
	
	/**
	 *  @return Constructor by default
	*/
	public Interval() {
		
	};
	/**
	 *  @return Constructor with ready-made array
	*/
	public Interval(Integer[] interval) {
		//Interval();
		this.interval=interval;
		n=interval.length;
	}
	
	/**
	 *  @return Build the interval as array from beginValue to endValue, with step=1
	 * 
	*/
	public Interval(Integer beginValue,Integer endValue) {
		//Interval();
		n=endValue-beginValue+1;
		interval=new Integer[n];
		for(int i=0; i<n;i++) {
			interval[i]=beginValue+i;
		}
		
		}
	/**
	 *  @return return the interval as array
	 * 
	*/
	public Integer[] getInterval() {
		return interval;
	}
	

}
