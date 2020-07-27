package ArraysExcercise;

import java.util.Scanner;

class AI{
	static void intersect() {
		System.out.println("enter the size of the First array:");
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		System.out.println("enter the size of the second Array:");
		Scanner scan2=new Scanner(System.in);
		int m=scan2.nextInt();
		System.out.println("Enter the Elements In First Array:");
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter The ELements In Second Array:");
		int arr2[]=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Intersect elements are:"+arr1[i]+" ");
				}
			}
		}
		
	}
}


public class ArrayIntersect {
public static void main(String[] args) {
	AI.intersect();
}
}
