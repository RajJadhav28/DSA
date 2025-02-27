package Arrays;

import java.util.Scanner;

public class Visites {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int visited[]=new int [arr.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=-1;
		}
		for(int i=0;i<visited.length;i++) {
			int count=1;
			if(visited[i]==0) {
				continue;
			}
			for(int j=i+1;j<visited.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=0;
				}
			}
			visited[i]=count;
		}
		for(int i=0;i<visited.length;i++) {
			if(visited[i]!=0) {
				System.out.println(arr[i]+":"+visited[i]);
			}
		}

	}

}
