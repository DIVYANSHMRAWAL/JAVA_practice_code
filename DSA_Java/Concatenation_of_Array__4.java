//QUESTION-->
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.

//ANSWER-->
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];

for(int i=0;i<nums.length;i++){
    ans[i]=nums[i];
}
for(int i=0;i<nums.length;i++){
ans[i+nums.length]=nums[i];
}
return ans;
    }
}