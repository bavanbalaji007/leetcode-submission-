class Solution {
    public int minFlips(int a, int b, int c) {
        int cnt=0;
        while(a>0 || b>0 ||c>0){
            int la=(a==1)?1:a&1,lb=(b==1)?1:b&1,lc=(c==1)?1:c&1;
            if(lc==1 && la==0 && lb==0) cnt+=1;
            else if(lc==0 && la==0 && lb==1) cnt+=1;
            else if(lc==0 && la==1 && lb==0) cnt++;
            else if(lc==0 && la==1 && lb==1) cnt+=2;
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        return cnt;
    }
}