class Solution 
{
    public static List<List<Integer>> TwoSum(int startIndex ,int target,int nums[])
    {
        List<List<Integer>> result=new ArrayList();
        int si=startIndex;
        int ei=nums.length-1;
        while(si<ei)
        {
            if(nums[si]+nums[ei]<target)
            {
                si++;
            }
            else if(nums[si]+nums[ei]>target)
            {
                ei--;
            }
            else if(nums[si]+nums[ei]==target)
            {
               List<Integer>subArray=new ArrayList();
                subArray.add(nums[si]);
                subArray.add(nums[ei]);
                result.add(subArray);
                
                while(si<ei&&nums[si]==nums[si+1])
                {
                 si++;   
                }
                while(si<ei&&nums[ei]==nums[ei-1])
                {
                 ei--;   
                }
                si++;
                ei--;
            }
        }
        return result;
        
    }
    public List<List<Integer>> threeSum(int[] nums)
    {
      List<List<Integer>> result=new ArrayList<>(); 
        int Target=0;
        if(nums.length<3)
        {
            return result;
        }
        
        Arrays.sort(nums);
        
        
        for(int i=0;i<nums.length-2;i++)
        {
            int val=nums[i];
            int nextTarget=Target-nums[i];
            if(i!=0 && nums[i]==nums[i-1])continue;
            
            List<List<Integer>> subArrays=TwoSum(i+1,nextTarget,nums);
            for(List<Integer> subarray:subArrays)
            {
                subarray.add(val);
                result.add(subarray);
            }
            
        }
        return result;
        
    }
}
