// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.
class Solution {
    public String commanPrefix(String str1, String str2) {
        String result = "";
        int strLength = 0;
        if (str1.length() > str2.length()) {
            strLength = str2.length();
        } else {
            strLength = str1.length();
        }
        for (int i = 0; i < strLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result += str1.charAt(i);
            } else {
                return result;
            }
        }
        return result;
    }

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = commanPrefix(result, strs[i]);
            if (result == "") {
                return result;
            }
        }
        return result;
    }
}