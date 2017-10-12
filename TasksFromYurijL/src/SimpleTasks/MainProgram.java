package SimpleTasks;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Compile and run java app from console.
Write program, which will pass requirements:
- User enter the interval (for example: [1;100]);
- Program prints odd numbers from start to the end of interval and even from end to
start;
Program prints the sum of odd and even numbers;
Program build Fibonacci numbers: F1 will be the biggest odd number and F2 – the
biggest even number, user can enter the size of set (n);
Program prints percentage of odd and even Fibonacci numbers;
  * 
 */
public class MainProgram {
	public int beginValue;
	public int endValue;
	
	/**
	 * Program's entry point
	 * 
	 * @param args
	 *            
	 */
	public static void main(String[] args) {
		new MainProgram().allActions();
	}
	public void allActions() {
		int choisMethod=Integer.valueOf(keyboard("Enter:   1 - work with interval;    2 - Fibanachi numbers"));
		if (1==choisMethod) {
		calcInterval();
		System.out.println("----------");
		}
		else if(2==choisMethod) {
			calcFibanachi();
			System.out.println("----------");
		}
		else {
			System.err.println("You enter incorrect the size of set (n) ");
		System.exit(-1);
		}
		
		
	}
	private void calcFibanachi() {
		int sizeOfFibanachiSet=Integer.valueOf(keyboard("Enter the size of the Fibanachi set (n) ->"));
		Fibanachi fibanachi=new Fibanachi(sizeOfFibanachiSet);
		System.out.println("Your Fibanachi set:");
		outputInterval(fibanachi.getArrayFibanachi());
		System.out.print("the biggest ODD number: ");
		System.out.println(fibanachi.biggestOddNumber());
		System.out.print("the biggest EVEN number: ");
		System.out.println(fibanachi.biggestEvenNumber());
		System.out.print("Pcentage of odd Fibonacci numbers: ");
		System.out.println(String.format(" %.0f",fibanachi.percentageOfOddNumbers())+"%");
		System.out.print("Pcentage of even Fibonacci numbers: ");
		System.out.println(String.format("%.0f",fibanachi.percentageOfEvenNumbers())+"%");
	}
	
	
	private void calcInterval() {
		beginValue=Integer.valueOf(keyboard("Enter begin value"));
		endValue=Integer.valueOf(keyboard("Enter end value"));
		Interval interval = new Interval(beginValue,endValue);
		System.out.println("Your interval: ["+beginValue+"; "+endValue+"]");
		outputInterval(interval.getInterval());
		System.out.println("Odd numbers from  start to the end");
		outputInterval(interval.oddNumbersFromStartToEnd());
		System.out.println("Even numbers from the end  to  start");
		outputInterval(interval.evenNumbersFromEndToStart());
		System.out.print("Sum of odd numbers: ");
		System.out.println(interval.calcSumOddNumbers());
		System.out.print("Sum of even numbers: ");
		System.out.println(interval.calcSumEvenNumbers());
			
	}
	/**
	 *  @return Print on the screen interval
	*/
	private void outputInterval(Integer[] interval) {
		for(Integer elem:interval) {
			System.out.print(elem);
			System.out.print("  ");
		}
		System.out.println();
	}
	private String keyboard(String message) {
		System.out.println(message+" ");
		Scanner scan =new Scanner(System.in);
		String rez=scan.next();
		//scan.close();
		return rez;
	}
	
}
