package second;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BucketSort bs1 = new BucketSort(50000);
		//bs1.display();
		long time3 = System.currentTimeMillis();

		bs1.startSort();
		System.out.println((double)(System.currentTimeMillis() - time3));
		//bs1.displayRez();
		
	}
}
