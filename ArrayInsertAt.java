package ArraysExcercise;

import java.util.Scanner;

class AIA{
	static void intersect(int item,int index) {
		System.out.println("enter the size of the array:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("enter the elements in the array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();	
		}
		if(index<n) {
			arr[n++]=item;
			for(int i=0;i<n;i++) {
				if(arr[i]==index) {
					arr[i]=arr[i+1];
					
				}
			}for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
		}
		
		
	}
	
	
	
}



public class ArrayInsertAt {
public static void main(String[] args) {
	AIA.intersect(30, 2);
}
}
