class NeighborSum:

    def __init__(self, grid: list[list[int]]):
        
        self.grid = grid

    def geoindex(self, value : int) -> list[int]:

        for i in range(len(self.grid)):

            for j in range(len(self.grid[0])):

                if self.grid[i][j] == value:

                    return [i, j]

        return []

    def adjacentSum(self, value: int) -> int:

        ni = len(self.grid)

        nj = len(self.grid[0])

        res = 0

        index = self.geoindex(value)

        if index:
            i, j = index[0], index[1]
        else:
            return None
        
        if i+1 < ni:
            res += self.grid[i+1][j]

        if i-1 > -1:
            res += self.grid[i-1][j]

        if j+1 < nj:
            res+= self.grid[i][j+1]

        if j-1 > -1:
            res += self.grid[i][j-1]

        return res

    def diagonalSum(self, value: int) -> int:

        ni = len(self.grid)
        nj = len(self.grid[0])

        res = 0

        index = self.geoindex(value)

        if index:
            oi, oj = index[0], index[1]
        else:
            return None

        if oi-1 > -1 and oj-1 > -1:
            res += self.grid[oi-1][oj-1]


        if oi+1 < ni and oj+1 < nj:
            res += self.grid[oi+1][oj+1]


        if oi-1> -1 and oj+1<nj:
            res += self.grid[oi-1][oj+1]
        

        if oi+1 < ni and oj-1 > -1:
            res += self.grid[oi+1][oj-1]
        
        return res
        
