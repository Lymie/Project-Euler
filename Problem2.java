public class Problem2 {
	public static void main(String[] args) {
		int max = 4000000;
		int first = 1;
		int second = 2;
		int sum = 0;
		int result = 2;

		while (sum < max) {
					
			sum = first + second;
			
			if (sum % 2 == 0) {
				result = result + sum;
			}
			first = second;
			second = sum;
			
		}
		System.out.print(result);
	}
}
