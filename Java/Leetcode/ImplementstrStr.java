public int strStr(String haystack, String needle) {
    if(needle == null || needle.length() == 0)
        return 0;
    for(int i=0;i<haystack.length();i++){
        if(haystack.charAt(i) == needle.charAt(0)){
            int k=i,j=0;
            while(k <= haystack.length()-1 && j <= needle.length()-1){
                if(haystack.charAt(k) != needle.charAt(j)){
                    break;
                }else{
                    k++;j++;
                }
            }
            if(j==needle.length())
                return i;
        }
    }
    return -1;
}
