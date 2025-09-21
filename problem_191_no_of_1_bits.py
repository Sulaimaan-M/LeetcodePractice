def hammingWeight(n: int) -> int:

    x = n
    res = 0

    while x != 0:

        remainder = int(x%2)

        x = x/2

        if remainder != 0:
            res +=1

    return res
