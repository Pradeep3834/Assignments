package ArraysExcercise;

import java.util.Scanner;

class Rev{
	static void reverse(){
	System.out.println("enter the size of array:");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	
	System.out.println("Enter The Elements In The Array");
	for(int i=0;i<n;i++) {
		arr[i]=scan.nextInt();
		
	}
	for(int i=n-1;i>=0;i--) {
		System.out.println(arr[i]+" ");
	}
		
		
	}
}



public class ArrayReverser {
public static void main(String[] args) {
	Rev.reverse();
}
}
