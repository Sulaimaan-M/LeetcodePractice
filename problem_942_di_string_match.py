def diStringMatch( s: str) -> list[int]:

    n = len(s)
    x = 0
    y = n

    res = []

    for i in range(n):

        if s[i] == 'I':
            res.append(x)
            x +=1
            if i == n-1:
                res.append(y)

        if s[i] =='D':
            res.append(y)
            y -= 1
            if i == n-1:
                res.append(x)

    return res
