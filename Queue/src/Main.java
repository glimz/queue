
public class Main {

	public static void main(String[] args) {
		int total = 0;
		int[] measurement = new int[] {3,4,6,4,3,8};
		Queue<Integer> queueOfIntegers = new Queue<>();
		
		for (int values: measurement) {
			total += values;
			queueOfIntegers.enqueue(values);
						
					
		}
		double average = (double) (total / measurement.length);
		System.out.print("Average measurement:" +average);

	}

}
