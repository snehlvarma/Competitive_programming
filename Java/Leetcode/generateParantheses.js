var generateParenthesis = function(n) {
    let res = [];
    
     let recursion = (l, r, temp) => {
        if(temp.length === n*2){
            res.push(temp)
            return 
        }
        if( l > 0){
            recursion(l-1, r, temp+'(');
        }
        if(r > 0 && r>l){
            recursion(l, r-1, temp+')')
        }
        
    }
    
    recursion(n,n, '');
    //console.log(res)
    return res
};
