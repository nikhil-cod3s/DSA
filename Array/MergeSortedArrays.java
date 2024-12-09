public class MergeSortedArrays {
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        mergeArrays(nums1,m , nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        // int[] result = mergeArrays(nums1, nums2);
        // for(int i = 0 ; i < result.length ; i++){
        //     System.out.println(result[i]);
        // }
    }
    
    public static void mergeArrays(int[] nums1,int m,  int[] nums2, int n)
    {
               // Pointers for nums1 and nums2
               int p1 = m - 1; // Pointer for the last element in nums1's initial part
               int p2 = n - 1; // Pointer for the last element in nums2
               int p = m + n - 1; // Pointer for the last position in nums1
               
               // Merge the arrays starting from the end
               while (p1 >= 0 && p2 >= 0) {
                   if (nums1[p1] > nums2[p2]) {
                       nums1[p] = nums1[p1];
                       p1--;
                   } else {
                       nums1[p] = nums2[p2];
                       p2--;
                   }
                   p--;
               }
               
               // If there are remaining elements in nums2, copy them
               while (p2 >= 0) {
                   nums1[p] = nums2[p2];
                   p--;
                   p2--;
               }


    }
}