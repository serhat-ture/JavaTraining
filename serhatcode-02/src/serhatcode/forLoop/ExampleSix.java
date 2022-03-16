package serhatcode.forLoop;

public class ExampleSix {
	//1-20 arasýndaki asal sayýlardan baþtan 
	//5. ve 6. sýradaki sayýlarýn çarpýmý
	public static void main(String[] args) {
		int result=1;
		int counter=0;
		boolean isPrime;
		for(int i=2; i<=20;i++) {
			isPrime=true;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				counter++;
				if(counter==5 || counter==6) {
					result*=i;
					System.out.println(counter+".Prime Number :" +i);
				}
			}
		}
		System.out.println("Result :"+result);
	}
}
