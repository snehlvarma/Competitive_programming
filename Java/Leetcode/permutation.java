class Solution {
    List<List<Integer>> listOfPermutations = new ArrayList<>(); //list to hold the permutations
    
    public List<List<Integer>> permute(int[] nums) {
        generatePermutations(new ArrayList<Integer>(), nums);
        return listOfPermutations;
    }
    
    private void generatePermutations(List<Integer> permutation, int[] nums){
        if(permutation.size() == nums.length){ 
            List<Integer> validPermutation = new ArrayList<Integer>(permutation);
            listOfPermutations.add(validPermutation);
            return;
        }
        
        /*Start a for loop for every number in the nums[] array and recursively call
        the backtracking function until a valid permutation is obtained. Since we do not want
        permutations with repeated numbers, we will skip a number if it has already been added
        to the permutation.*/
        
        for(int i = 0; i < nums.length; i++){
            if(permutation.contains(nums[i])){  //skip if already added
                continue;
            }
            permutation.add(nums[i]);
            generatePermutations(permutation, nums);
            permutation.remove(permutation.size() - 1);
        }
    }
}
