def minSum(self, nums1: list[int], nums2: list[int]) -> int:

    sum1, sum2 = 0, 0
    zero1, zero2 = 0, 0

    for x in nums1:
        if x == 0:
            zero1 += 1
        sum1 += x

    for y in nums2:
        if y == 0:
            zero2 += 1
        sum2+= y

    minPot1 = sum1+zero1
    minPot2 = sum2+zero2

    if minPot1 == minPot2 :

        return minPot1

    maximum = max(minPot1, minPot2)
    minimumZeros = zero1 if min(minPot1, minPot2) == minPot1 else zero2

    return  -1 if minimumZeros == 0 else maximum
