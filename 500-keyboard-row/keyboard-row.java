class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> row1=new HashSet<>( Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> row2=new HashSet<>( Arrays.asList('a','s','d','f','g','h','j','k','l'));
        HashSet<Character> row3=new HashSet<>( Arrays.asList('z','x','c','v','b','n','m'));
        List<String> r=new ArrayList<>();
        for(String str:words){
            char first=Character.toLowerCase(str.charAt(0));
            HashSet<Character> curr;
            if(row1.contains(first)){
                curr=row1;
            }else if(row2.contains(first)){
                curr=row2;
            }else{
                curr=row3;
            }
            int flag=0;
            for(int i=1;i<str.length();i++){
                if(!curr.contains(Character.toLowerCase(str.charAt(i)))){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                r.add(str);
            }
        }
        return r.toArray(new String[0]);
    }
}