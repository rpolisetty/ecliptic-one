/**
 * 
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ramesh
 *
 */
public class BubbleSort {

	private static int count = 10;
	private static List<String> stringList = new ArrayList<String>();
	
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
			System.out.print("argument [" + i + "] = " + args[i]);
		}
		BubbleSort bs = new BubbleSort();
		bs.read();
		bs.sort();
		bs.print();
	}

	private void print() {
		System.out.print("Sorted list:");
		for (int i=0; i < stringList.size(); i++) {
			System.out.print("Item [" + i + "] = " + stringList.get(i));
		}
	}

	private void sort() {
		// TODO Auto-generated method stub
		System.out.print("sort() not yet implemented");
	}

	private String getRandomString() {
		return String.valueOf(Math.random());
	}
	
	private void read() {
		// TODO Auto-generated method stub
		for (int i=0; i < count; i++) {
			stringList.add(getRandomString());
		}
	}
}
