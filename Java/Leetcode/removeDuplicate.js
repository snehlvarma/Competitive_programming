var removeDuplicates = function(nums) {
    if(nums.length <= 1) return nums.length;
    let left = 0;
    let right = left + 1;
    const end = nums.length - 1;
    
    while (right <= end) {
        if (nums[left] === nums[right]) {
            right++;
        } else {
            left++;
            nums[left] = nums[right];
            right++;
        }
    }
    return left + 1;
};
