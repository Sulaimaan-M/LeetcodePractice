def arrange(nums : list[int]) -> list[int]:
    
    pointerA = 0
    pointerB = 0
    
    
    while pointerA+1 != len(nums) and pointerB+1 != len(nums):
        
        if nums[pointerA] != 0:
            
            pointerA += 1
        
        if nums[pointerB] == 0 or pointerB <= pointerA:
            
            pointerB += 1
            
        if pointerB > pointerA and nums[pointerB] != 0:
        
            nums[pointerA] = nums[pointerB]
            
            nums[pointerB] =0
    
    return nums