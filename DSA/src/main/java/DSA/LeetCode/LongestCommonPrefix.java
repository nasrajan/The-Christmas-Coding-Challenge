package DSA.LeetCode;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int maxl = strs[0].length();
        List<String> st = Arrays.asList(strs);
        String prefix = "";
        if (!strs[0].equals("")) {
            prefix = strs[0].substring(0,1);
        }
        boolean longest = false;
      /*  if (strs[0].length() == 1) {
            for (int i=1; i<strs.length; i++) {
                if (!strs[i].equals("") && strs[i].substring(0,1).equals(strs[0])) {
                    longest = true;
                } else {
                    longest = false;
                }
            }
            if (longest == false) return "";
            else return strs[0];
        }*/
        String prev = "";

        for(int j=1; j<=maxl; j++) {
            longest = false;
            prefix = strs[0].substring(0,j);
            for (int i=1; i<strs.length; i++) {
                //System.out.println(prefix);
                //System.out.println(strs[i].substring(0,j));
                if (!strs[i].equals("") && strs[i].substring(0,j).equals(prefix)) {
                    longest = true;
                } else {
                    longest = false;
                    break;
                }
                // System.out.println(longest);
                if (strs[i].length() < maxl) maxl = strs[i].length();
            }
            if (longest == false) {
                return prev;
            } else {
                prev = prefix;

            }
            // int[] l =  st.forEach(value -> value.length() );
        }

        return prev;
    }
}
