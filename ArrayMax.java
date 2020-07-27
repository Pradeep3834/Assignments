package ArraysExcercise;

import java.util.Scanner;

class Array{

static void  max() {
	System.out.println("Enter thesixe of the array");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	System.out.println("enter the elements:");
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=scan.nextInt();
		
	}
	int max=a[0]; 
	for(int i=0;i<n;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}System.out.println("max element:" +max);
	
	
}



}




public class ArrayMax {

	public  static void main(String[] args) {
	
		Array.max();
	
		
	}
	}

