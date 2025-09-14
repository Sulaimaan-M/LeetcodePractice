def subarraySum(nums: list[int], k: int) -> int:

    runningSum = 0
    subArrayCount = 0
    prefixSums = {0:1}

    for i in nums:
        runningSum += i
        diff = runningSum -k
        subArrayCount += prefixSums.get(diff, 0)
        prefixSums[runningSum] = 1+ prefixSums.get(runningSum, 0)

    return subArrayCount
