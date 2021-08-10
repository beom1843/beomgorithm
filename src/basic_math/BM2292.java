package basic_math;

import java.util.Scanner;

public class BM2292 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int min = 2;
		
		if(n==1){
			System.out.println(1);
		}else{
			while(n>min){
				min+=6*count;
				count+=1;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
