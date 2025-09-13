def lengthOfLongestSubstring(s: str) -> int:

    uniqueSet : set = set()
    longestLen = 0
    pointerA = 0
    pointerB = 0 

    while pointerB < len(s):

        ch = s[pointerB]

        if(uniqueSet.__contains__(ch)):
            remoVal = s[pointerA]
            uniqueSet.remove(remoVal)
            pointerA = pointerA+1
        else:
            uniqueSet.add(ch)
            pointerB = pointerB+1

        length = (pointerB-pointerA)
        longestLen = max(length, longestLen)

    return longestLen