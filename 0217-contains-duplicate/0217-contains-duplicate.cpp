class Solution {
public:
    bool containsDuplicate(vector<int>& numss) {
        unordered_map<int, int> seen;
        for (int num : numss) {
            if (seen[num] >= 1)
                return true;
            seen[num]++;
        }
        return false;
    }
};