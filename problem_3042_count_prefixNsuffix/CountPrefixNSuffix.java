package leetcode.problem_3042_count_prefixNsuffix;

public class CountPrefixNSuffix {

    public int countPrefixNSuffix(String[] words){

        int count =0;
        for(int i = 0; i< words.length;i++){

            for(int j = i+1; j< words.length;j++){

                String pns = words[i], word = words[j];

                if(pns.length()>word.length())
                    continue;

                if(isPrefixNSuffix(pns, word)){

                    count++;

                }

            }

        }        return count;

    }

    private boolean isPrefixNSuffix(String pns, String word) {

        int size = pns.length();
        if(isPrefix(pns, size, word) && isSuffix(pns, size, word)){

            return true;

        }

        return false;

    }

    private boolean isSuffix(String pns, int size, String word) {

        int len = word.length();
         String temp = word.substring(len-size,len);

        if(temp.equals(pns)){

            return true;

        }

        return false;

    }

    private boolean isPrefix(String pns, int size, String word) {
        
        String temp = word.substring(0,size);

        if(temp.equals(pns)){

            return true;

        }

        return false;

    }
    
}
