class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<s.length();i++){
            
            c1[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<s1.length();i++){
            
            c2[s1.charAt(i)-'a']++;
        }
        
        int res=0;
        for(int i=0;i<26;i++){
            
            res+=Math.abs(c1[i]-c2[i]);
        }
        
        return res;
        }
}
