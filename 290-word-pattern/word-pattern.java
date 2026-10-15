class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        
        String[] arr=s.split("\\s+");
        if(arr.length !=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String str=arr[i];
            if(map.containsKey(ch) && !map.get(ch).equals(str)) return false;
            if(map2.containsKey(str) && map2.get(str)!=ch) return false;
            map2.put(str,ch);
            map.put(ch,str);
        }
        return true;

    }
}