def findMinMoves(self, machines: list[int]) -> int:

    n = len(machines)
    totalClothes = sum(machines)
    setAmount = int(totalClothes / n)

    if totalClothes % n != 0:

        return -1

    clothes_current, res = 0, 0

    for x in machines:

        diff = x - setAmount

        clothes_current += diff

        res = max(res, clothes_current*-1 if clothes_current < 0 else clothes_current, diff)

    return res
