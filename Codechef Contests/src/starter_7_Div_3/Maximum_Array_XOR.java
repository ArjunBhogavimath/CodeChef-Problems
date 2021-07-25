package starter_7_Div_3;

import java.util.Scanner;

public class Maximum_Array_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		while(T-->0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			double len = Math.pow(2, N);
			int length = (int)len;
			 
			int arr[] = new int[length];
			for(int i=0;i<length;i++) {
				arr[i] = i;
			}
			
			int sum =0;
			
			while(K!=0) {
				for(int i=1, j=2;i<length && j<length;i++,j++) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				K--;
			}
			
			for(int i=0;i<length;i++) {
				sum += arr[i] ^i;
			}
			System.out.println(sum);
			
		
		}
		

	}

}
