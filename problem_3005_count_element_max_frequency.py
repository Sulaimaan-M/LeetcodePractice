def maxFrequencyElements(self, nums: list[int]) -> int:

    top = [0]
    countMap = {}

    for num in nums:

        count = countMap.get(num, 0)
        count +=1
        countMap[num] = count

        if count > top[0]:

            top.clear()
            top.append(count)

        elif count == top[0]:

            top.append(count)

    return sum(top)
