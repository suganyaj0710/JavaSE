package com.javaSE8.programs;

public class FindMissingNumberInFirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("FindMissingNumberInFirstNNaturalNumbers");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        System.out.println(find(nums, n));
        int[] nums1 = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("nums1 missing numbers: " +find(nums1, n));
        int[] nums2 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println("nums2 missing numbers: " +find(nums2, n));
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(find(nums3, n));
        int[] nums4 = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(find(nums4, n));
        int[] nums5 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(find(nums5, n));
    }

    private static long find(int[] nums, int n) {
        long temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
        }
        long firstNTotal = sum(n);
        return firstNTotal - temp;
    }

    private static long sum(long n) {
        return (n * (n + 1)) / 2;
    }
}
