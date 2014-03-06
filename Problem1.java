
public class Problem1 {
	
	public static void main(String[] args){
	final int x = 3;
	final int y = 5;
	int max = 1000;
	
	int sum = 0;
	
	for (int i = 0; i < max; i++){
		if(i % x == 0 || i % y == 0){
			sum += i;
		}
	}
	
	System.out.print(sum);

}
}