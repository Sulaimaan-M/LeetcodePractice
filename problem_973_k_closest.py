import heapq
def kClosest( points: list[list[int]], k: int) -> list[list[int]]:

        minHeap = []

        for x, y in points:
            distance = (x ** 2)+(y ** 2)
            minHeap.append([distance, x, y])
        
        heapq.heapify(minHeap)
        res = []

        while k > 0:

            dist, x, y = heapq.heappop(minHeap)
            res.append([x,y])
            k = k-1
        
        return res