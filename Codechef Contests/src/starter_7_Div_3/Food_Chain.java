package starter_7_Div_3;

import java.util.Scanner;

public class Food_Chain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		while(T-->0) {
			int E = sc.nextInt();
			int K = sc.nextInt();
			
			int X =0;
			
			while(E!=0) {
				E = E/K;
				X++;
			}
			
		 System.out.println(X);
			
		}

	}

}
