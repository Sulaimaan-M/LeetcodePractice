def wordBreak(s: str, wordDict: list[str]) -> bool:

    words = set(wordDict)

    pointerI = 0

    pointerJ = 0

    isPossible = True

    while pointerI <= len(s) and pointerJ <= len(s):

        string = s[pointerI:pointerJ]
        
        res = string in words

        print(string)

        print(res)

        if res:
            pointerI = pointerJ
            pointerJ +=1

        else:
            pointerJ +=1

        isPossible = res

    return isPossible


print(wordBreak("aaaaaaa", ["aaaa", "aaa"]))