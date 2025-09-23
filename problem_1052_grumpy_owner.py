def maxSatisfied(self, customers: list[int], grumpy: list[int], minutes: int) -> int:

    n = len(customers)
    i, j = 0, 0
    satisfaction = 0
    maxSatisfaction = -1
    totalDefault = 0

    for j in range(n):

        if (j)-i == minutes:
            if grumpy[i] == 1:
                satisfaction -= customers[i]
            i +=1

        if grumpy[j] == 1:
            satisfaction += customers[j]

        if grumpy[j] == 0:
            totalDefault += customers[j]

        if satisfaction > maxSatisfaction:

            maxSatisfaction = satisfaction

        # Added When Debugging
        # print(f"i is {i}, j is {j}, satisfaction is {satisfaction}, default is {totalDefault}")

    return maxSatisfaction + totalDefault
