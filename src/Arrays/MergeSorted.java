package Arrays;

public class MergeSorted {
	public void merge(int num1[], int num2[], int n, int m) {
		//Pointers for num1, num2, and the merged array
        int p1 = m - 1; // Last index of the actual elements in nums1
        int p2 = n - 1; // Last index of nums2
        int p = m + n - 1; // Last index of nums1's total space
        
     // Merge nums2 into nums1 starting from the end
		while(p1>=0 && p2>=0) {
			if(num1[p1]>num2[p2]) {
				num1[p]=num1[p1];
				p1--;
			}else {
				num1[p]=num2[p2];
				p2--;
			}
			p--;
			System.out.println("Current num1:"+java.util.Arrays.toString(num1));
		}
		// If there are any elements left in nums2, copy them into nums1
		while(p2>=0) {
			num1[p]=num2[p2];
			p2--;
			p--;
			System.out.println("Filling remaning num2:"+java.util.Arrays.toString(num1));
		}	
	}
	public static void main(String[] args) {
		MergeSorted ms=new MergeSorted();
		 int[] num1 = {1, 2, 3, 0, 0, 0}; // nums1 has space for nums2
	        int m = 3; // Number of elements in nums1
	        int[] num2 = {2, 5, 6}; // nums2 array
	        int n = 3; // Number of elements in nums2
		ms.merge(num1, num2, n, m);
		System.out.println(java.util.Arrays.toString(num1));//first method to display
		   System.out.print("Merged array: ");//second method to display
	        for (int num : num1) {
	            System.out.print(num + " ");
	        }
		
	}

}
