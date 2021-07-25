package starter_7_Div_3;
import java.util.Scanner;
public class Chess_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum =a+b;
		
		if(sum<3){
		    System.out.println(1);
		}
		else if(sum>=3 && sum<=10){
		    System.out.println(2);
		}
		else if(sum>=11 && sum<=60){
		    System.out.println(3);
		}
		else if(sum>60){
		    System.out.println(4);
		}
		T--;
		}

	}

}
