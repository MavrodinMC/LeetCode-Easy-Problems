package com.mavro;


/*

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.


 */



public class Solution {


    public int[] runningSum(int[] nums) {

        // variabila prev sum = 0;
        // suma unui element va fi egala cu suma ultimelor elemente;
        // adaugam suma in array;
        // previous sum = prev_sum + nums[i];
        //    i
        //[1, 2, 3, 4];


        int prev_sum = 0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prev_sum += nums[i];
            arr[i] = prev_sum;

        }

        return arr;
    }

  }
