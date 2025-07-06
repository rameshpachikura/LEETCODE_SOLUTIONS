class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        ArrayList<Double> a=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            double d=(nums[i]+nums[n-(i+1)])/2.0;
            System.out.println(nums[i]+" "+nums[n-(i+1)]);
            a.add(d);
            System.out.println(d);
        }
        Collections.sort(a);
        return a.get(0);
    }
}