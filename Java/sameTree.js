var isSameTree = function(p, q) {
    let stack = [[p,q]];
    
    while (stack.length){
        let [x,y] = stack.shift();
		
        // if both leaves
        if (x==null && y==null) continue; 
        if(!x || !y) return false;
        if(x.val == y.val){
            stack.push([x.left, y.left]);
            stack.push([x.right, y.right]);
        }
        else return false;
    }
    return true;
}
