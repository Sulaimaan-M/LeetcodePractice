import collections


def numIslands(grid: list[list[str]]) -> int:

    islands = 0
    visited = set()
    directions = [[0, 1], [0, -1], [-1, 0], [1, 0]]
    rowCount = len(grid)
    columnCount = len(grid[0])

    def explore(r : int, c : int):

        q = collections.deque()
        q.append((r, c))

        while q :

            qr, qc = q.popleft()
            visited.add((qr, qc))

            for dr, dc in directions:

                nr, nc = qr+dr, qc+dc

                if (nr in range(rowCount) and 
                    nc in range(columnCount) and 
                    (nr, nc) not in visited and 
                    grid[nr][nc] == "1" and 
                    (nr, nc) not in q):
                    q.append((nr, nc))

    for r in range(rowCount) :

        for c in range(columnCount):

            curr = grid[r][c]

            if curr  == "1" and (r, c) not in visited:

                explore(r, c)
                islands = islands +1

    return islands
