package leetcode.unsolved.problem_1400_can_construct_palindrome;

import java.util.HashSet;

public class CanConstruct {
    
    public boolean canConstruct(String s, int k){

        HashSet<Character> charSet = new HashSet<>();

        if(s.length()<k){

            return false;

        }

        for(int i = 0; i< s.length(); i++){

            Character c = s.charAt(i);

            if(charSet.contains(c)){

                charSet.remove(c);

            }else{

                charSet.add(c);

            }

        }

        if(charSet.size()<=k)
            return true;
        else
            return false;

    }
}
