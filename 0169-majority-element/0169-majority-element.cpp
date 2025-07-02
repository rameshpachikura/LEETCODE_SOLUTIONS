class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        unordered_map<int,int> map;
        for(auto i:nums){
            map[i]++;
        }
        for(auto k:map){
            int x=k.second;
            if(x>(n/2)){
                return k.first;
            }
        }
        return -1;
    }
};