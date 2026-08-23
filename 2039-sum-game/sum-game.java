class Solution {
    public boolean sumGame(String num) {
        int N=num.length();
        int half=N/2;
        int sl=0,sr=0;
        int ql=0,qr=0;
        for(int i=0;i<N;i++){
            if(num.charAt(i)=='?'){
                if(i<half) ql++;
                else qr++;
            }else{
                if(i<half) sl+=num.charAt(i)-'0';
                else sr+=num.charAt(i)-'0';
            }
        }
        if((ql+qr) %2!=0) return true;
        return (2*sl+9*ql)!=(2*sr+9*qr);
    }
}