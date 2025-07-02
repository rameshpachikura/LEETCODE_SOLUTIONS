class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         vector<int> v;
         unordered_map<int, int> freq;
         for(int i=0;i<nums.size();i++){
             freq[nums[i]]=i;
         }
         for(int i=0;i<nums.size();i++){
            int x=target-nums[i];
            if(freq.count(x) && freq[x] != i){
                v.push_back(i);
                v.push_back(freq[x]);
                break;
            }
         }
    return v;
    }
};