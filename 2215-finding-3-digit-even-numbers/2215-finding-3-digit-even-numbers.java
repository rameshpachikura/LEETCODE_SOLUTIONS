class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
        ArrayList<Integer> tempList=new ArrayList<>();
        int c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(digits[i],hm.getOrDefault(digits[i],0)+1);
        }
        for(int i=100;i<999;i++){
            if(i%2==0){
                if(check(digits,i)){
                    tempList.add(i);
                }
            }
        }
      int[] a = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            a[i] = tempList.get(i);
        }
        Arrays.sort(a);
        return a;
    }
    public boolean check(int[] digits,int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        boolean x=false;
        for(int i=0;i<digits.length;i++){
            hm.put(digits[i],hm.getOrDefault(digits[i],0)+1);
        }
        HashMap<Integer,Integer> hm1=new HashMap<>();
        while(n>0){
            int r=n%10;
            n=n/10;
            hm1.put(r,hm1.getOrDefault(r,0)+1);
            if(hm.containsKey(r) && hm1.get(r)<=hm.get(r)){
                continue;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}