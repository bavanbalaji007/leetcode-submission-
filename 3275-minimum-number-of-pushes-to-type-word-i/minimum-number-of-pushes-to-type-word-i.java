class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        for (int i = 0, j = freq.length - 1; i < j; i++, j--) {
    int temp = freq[i];
    freq[i] = freq[j];
    freq[j] = temp;
}
        int sum=0,count=0,press=1;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                if(count%8==0 && count!=0){
                    press++;
                }
                sum+=(freq[i]*press);
                count++;
            }
        }
        return sum;
    }
}