def removeDuplicates(nums: list[int]) -> int:

    lookOut = None
    lcount = 0

    i = 0

    while i <len(nums):

        if nums[i] == lookOut:
        
            lcount += 1

            if lcount > 2:

                nums.remove(lookOut)
                continue
        
        else :

            lookOut = nums[i]

            lcount = 1
        
        i += 1
    
    return len(nums)