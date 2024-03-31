package LeetCodeProblem;

import java.util.Arrays;

public class MergeTwoArray {
    public int[] mergeOurAnswer(int[] nums1, int m, int[] nums2, int n) {
        int length=nums1.length-1;
        n--;
        m--;
        while(n!=-1){
            if((m!=-1)&&nums1[m]>nums2[n]){
                nums1[length]=nums1[m];
                m--;
            }
            else{
                nums1[length]=nums2[n];
                n--;
            }
            length--;
        }

        return nums1;
    }
    public int[] mergeLearnAnswer(int[] nums,int m,int[] nums1,int n){
        for(int k=0;k<n;k++){
            nums[k+m]=nums1[k];
        }
        Arrays.sort(nums);
        for(int nn:nums){
            System.out.println(nn);
        }
        return nums;
    }

}
