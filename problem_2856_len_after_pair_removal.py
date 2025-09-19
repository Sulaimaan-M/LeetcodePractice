def minLengthAfterRemovals(self, nums: list[int]) -> int:

    n = len(nums)

    countMap = {}

    dominant = 0

    for num in nums:

        count = countMap.setdefault(num, 0)

        count += 1

        countMap[num] = count

        if count > n / 2:

            dominant = count

    if dominant != 0:

        ndPart = n - dominant

        return dominant - ndPart

    if n % 2 != 0:

        return 1
    else:

        return 0
