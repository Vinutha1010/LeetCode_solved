class Solution {
    public String reverseVowels(String s) {
       if(s== null || s.length()==0){
        return s;
       }
       char[] ch= s.toCharArray();
       int i=0;
       int j=ch.length-1;

       String vow= "aeiouAEIOU";

       while(i<j){
            
            while(i<j && vow.indexOf(ch[i])==-1){
                i++;
            }
            while(i<j && vow.indexOf(ch[j])==-1){
                j--;
            }

            char temp= ch[i];
            ch[i]=ch[j];
            ch[j]=temp;

            i++;
            j--;
       }
       return new String(ch);

        
    }
}