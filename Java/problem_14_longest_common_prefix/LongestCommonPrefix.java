package leetcode.problem_14_longest_common_prefix;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs){

        StringBuilder commonPrefix = new StringBuilder();
        boolean isPrefixEnd = false;
        String initStr = strs[0];

        for(int i = 0; i<initStr.length(); i++){

            commonPrefix.append(initStr.charAt(i)); 

            for(int j = 0; j< strs.length; j++){

                if(!strs[j].startsWith(new String(commonPrefix))){

                    isPrefixEnd = true;
                    break;

                }

            }

            if(isPrefixEnd){
                commonPrefix.deleteCharAt(i);
                break;
            }

        }

        return new String(commonPrefix);

    }
    
}
