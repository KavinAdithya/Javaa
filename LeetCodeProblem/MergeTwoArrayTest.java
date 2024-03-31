package LeetCodeProblem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MergeTwoArrayTest {
    MergeTwoArray mg=new MergeTwoArray();
    @Test
    public void mergeOurAnswer(){
        int[] nums ={1,2,3,0,0,0};
        int[] nums1 ={2,5,6};
        int []expected={1,2,2,3,5,6};
        assertArrayEquals(expected,mg.mergeOurAnswer(nums,3,nums1,3));
    }
    @Test
    public void mergeLearnAnswer(){
        int[] nums ={1,2,3,0,0,0};
        int[] nums1 ={2,5,6};
        int []expected={1,2,2,3,5,6};
        assertArrayEquals(expected,mg.mergeLearnAnswer(nums,3,nums1,3));
    }
}