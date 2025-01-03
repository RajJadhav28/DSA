package Basics_Of_Java;


class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5}; // Sorted array as input
        int uniqueCount = solution.removeDuplicates(arr);

        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Updated array: ");
        
        // Print the updated array with unique elements
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


    






    

