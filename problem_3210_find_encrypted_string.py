
# Beats 100% of Solutions in Runtime

def getEncryptedString(self, s: str, k: int) -> str:

    n = len(s)
    i = 0
    res = ""

    if k>= n:
        k = k%n

    for i in range(n):

        index = i+k

        if index >= n:

            res += s[index-n]
        else:
            res += s[index]

    return res
