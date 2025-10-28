class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                a.add(i);
            }
        }
        int cnt=0;
        int[] pref=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        for(int i=0;i<a.size();i++){
            int res=a.get(i);
            int ls=pref[res];
            int rs=pref[n-1]-pref[res];
            if(rs==ls){
                cnt+=2;
            }
            else if((rs-1)==ls){
                cnt++;
            }
            else if(rs==(ls-1)){
                cnt++;
            }
        }
        return cnt;

    }
}