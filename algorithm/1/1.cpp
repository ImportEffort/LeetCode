//
//  main.cpp
//  1TwoSum
//
//  Created by 骆梁宸 on 16/9/5.
//  Copyright © 2016年 Liangchen Luo. All rights reserved.
//

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ret;
        for (int i = 0; i < nums.size(); ++i) {
            for (int j = i + 1; j < nums.size(); ++j) {
                if (nums[i] + nums[j] == target) {
                    ret.push_back(i);
                    ret.push_back(j);
                    return ret;
                }
            }
        }
        return ret;
    }
};

int main(int argc, const char * argv[]) {
    return 0;
}
