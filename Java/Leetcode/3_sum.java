class Solution {
      public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] > 0) k--;
                else if(nums[i] + nums[j] + nums[k] < 0) j++;
                else{
                    if(!set.contains(new Pair(nums[i], nums[j]))){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        set.add(new Pair(nums[i], nums[j]));
                    }
                    j++;
                    k--;
                }
            }
        }
        
        return res;
    }
}
