class Solution {
    
    //Map for literals      
    static HashMap<Integer, Character> map = new HashMap();

    public String intToRoman(int num) {
        
        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');
        
        int curr = 0;
        int rest = num;
        
        StringBuilder s = new StringBuilder();
        
        while (rest > 0){
            
            for(int t = 3; t >= 0; t--){
                
                int divider = (int)Math.pow(10, t);
                
                curr = rest / divider;
                rest = rest % divider;
            
                if( 0 < curr && curr < 4){
                    char c = map.get(divider);
                    for(int i = 0; i < curr; i++){
                        s.append(c);                        
                    }
                    
                } else if (curr == 4 || curr == 9){
                    s.append(speciaclCase(curr, divider));
                    
                } else if (curr == 5) {
                    char c = map.get(curr * divider);
                    s.append(c);
                    
                } else if (5 < curr && curr < 9){
                    char cInit = map.get(5 * divider);
                    s.append(cInit);
                    
                    char c = map.get(divider);            
                    for(int i = 0; i < curr - 5; i++){
                        s.append(c);                        
                    }
                    
                }
                
            }
            
        }
        
        return s.toString();
    }
    
    String speciaclCase(int curr, int divider){
        char cMain = map.get((curr+1) * divider);
        char cSubstractor = map.get(divider);
        return new StringBuilder(cSubstractor)
            .append(cSubstractor)
            .append(cMain)
            .toString();
    }
    
}
