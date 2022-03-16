package serhatcode.forLoop;

public class ExampleOne {

	public static void main(String[] args) {
		// 1-10 kadar ortalama
		float sum=0;
		int counter=0;
		float average=0;
		for(int i=1;i<10;i++) {
			counter++;
			sum+=i;
		}
		average=sum/counter;
		System.out.println("Average :"+average);
		
		

	}

}
