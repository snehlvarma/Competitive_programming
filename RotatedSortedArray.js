const search = function(nums, target) {
    let count = 0;
    let isTarget = false;
    for(; count < nums.length; count++){
        if(nums[count] === target){
            isTarget = true;
            break;
        }
    }

    const result  = isTarget === true ? count : -1;

    return result;
};
