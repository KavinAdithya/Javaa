class WorkSpace{
    public static void main(String []args){

        System.out.println("Kavin\nNew Era Will Begin Soon Techcrack");
        int[] nums={1,2,3,9,8,0};
        int[] nums1={1,2,4,5,6,5,6};
        System.arraycopy(nums1,2,nums,3,3);
        for(int n:nums){
            System.out.println(n);
        }
    }
}