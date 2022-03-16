package serhatcode.forLoop;
import java.util.Scanner;

public class ExampleThree {

	// 5! = 5*4*3*2*1 = 120 gösterime sahip faktöriyel hesabý
	public static void main(String[] args) {
		int result=1;
		String resultString;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scanner.nextInt();
		//System.out.print(number+"! = ");
		resultString = number+"! = "; //5! = ""+"5! ="
		for(int i=number;i>0;i--) {
			resultString = resultString+i+(i>1?"*":"");  // 5! = 5*4*3*2* + 1 + ""
			System.out.println(resultString);
			//System.out.print(i+(i>1?"*":""));
			/*if(i>1) {
				System.out.print("*");
			}*/
			result*=i;
		}
		resultString =  resultString+" = "+result;
		//System.out.print(" = "+result);
		System.out.println(resultString);
	}

}
