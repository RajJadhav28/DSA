package Arrays;

import java.util.Scanner;

public class Visits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int visited[]=new int[arr.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=-1;
		}
		for(int i=0;i<visited.length;i++) {
			int count=1;// Start with a count of 1 for the current element
			if(visited[i]==0) {
				continue;//skips if already visited
			}
			for(int j=i+1;j<visited.length;j++) {
				if(arr[i]==arr[j]) {
					count++;// Increment count for duplicate
					visited[j]=0;// Mark the duplicate as processed
				}
			}
			visited[i]=count;// Store the count for the current element
		}
		for(int i=0;i<visited.length;i++) {
			if(visited[i]!=0) {
				System.out.println(arr[i]+":"+visited[i]);
			}
		}

	}

}
