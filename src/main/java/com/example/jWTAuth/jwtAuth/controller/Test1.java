package com.example.jWTAuth.jwtAuth.controller;

public class Test1 {
    public static void main(String args[]) {
        int[] nums = {2, 3, 4, 5, 6, 3}; // Input array
        int val = 3; // Value to remove
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation
        for(int e: nums) {
            System.out.println(nums[e]);
        }

    }

    private static int removeElement(int[] nums, int val) {
        int i = nums.length;
        int k = 0;
        int[] nums2;

        while (i > 0) {
            if (nums[i - 1] != val) {
                nums[k] = nums[i - 1];
                k++;
            } else {
                nums[i-1] = 0;
            }
            i--;
        }

        return k;
    }

//    public static int removeElement(int[] nums, int val) {
//        int k = 0; // Pointer for where to write the next non-val element
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//
//        // Now, nums[0 to k-1] contains the elements not equal to val
//        return k;
//    }
}
