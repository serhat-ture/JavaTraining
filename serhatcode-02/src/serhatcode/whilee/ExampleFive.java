package serhatcode.whilee;

public class ExampleFive {

	public static void main(String[] args) {
		int number=1;
		int sum =0;
		double average=0;
		
		while(number<11) {
			sum+=number;
			number+=1;	
		}
		average = (double)sum/10;
		System.out.println("Sum :"+ sum);
		System.out.println("Average :"+ average);
				

	}

}
