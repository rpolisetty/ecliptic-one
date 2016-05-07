/**
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ramesh
 *
 */
public class BubbleSort {

	private static int count = 10;
//	private static List<String> stringList = new ArrayList<String>();
	private static String [] stringArray = new String[count];
	
	/**
	 * 
	 */
	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i < args.length; i++) {
			System.out.println("argument [" + i + "] = " + args[i]);
		}
		BubbleSort bs = new BubbleSort();
		bs.read();
		bs.print();
		bs.sort();
		bs.print();
	}

	private void print() {
		System.out.println("Sorted list:");
		for (int i=0; i < stringArray.length; i++) {
			System.out.println("Item [" + i + "] = " + stringArray[i]);
		}
	}

	private void sort() {
	
		if (stringArray.length <= 1) {
			return;
		}
		
		for (int i=0; i < stringArray.length - 1; i++) {
			for (int j=i+1; j < stringArray.length; j++) {
				
				if (stringArray[i].compareToIgnoreCase(stringArray[j]) > 0){
					String temp = stringArray[j];
					stringArray[j] = stringArray[i];
					stringArray[i] = temp;
				}
			}
		}
	}

	private String getRandomString() {
		return String.valueOf(Math.random());
	}
	
	private void read() {
		// TODO Auto-generated method stub
		for (int i=0; i < count; i++) {
			stringArray[i] = getRandomString();
		}
	}
}
