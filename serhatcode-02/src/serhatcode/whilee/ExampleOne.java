package serhatcode.whilee;

public class ExampleOne {

	public static void main(String[] args) {
		int number=1;
		while(number<20) {
			//kod blok
			//number+=1;
			System.out.println(number);
			if(number==10) {
				break;
			}
			number+=1;
		}
		System.out.println("Finish");

	}

}
