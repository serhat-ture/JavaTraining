package serhatcode.whilee;

public class ExampleTwo {
	public static void main(String[] args) {
		int number=0;
		while(number<20) {
			//kod blok
			//number+=1;
			number+=1;
			if(number==10) {
				continue;
			}
			System.out.println(number);
			
		}
		System.out.println("Finish");

	}

}
