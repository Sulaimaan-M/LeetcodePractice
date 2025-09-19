def minAnagramLength( s: str) -> int:

    n = len(s)

    divisors = []

    for i in range(1, int(n/2)+1):

        if n%i == 0:

            divisors.append(i)

    for divisor in divisors:

        i  = 0

        end = i+divisor

        isMatch = True

        initFreqMap = {}
        currFreqMap = {}

        for i in range(n+1):

            if i == end:

                if not initFreqMap:

                    initFreqMap = currFreqMap.copy()

                isMatch = initFreqMap == currFreqMap

                if not isMatch or i == n:

                    break

                currFreqMap.clear()

                end += divisor

            count = currFreqMap.setdefault(s[i], 0)

            count += 1

            currFreqMap[s[i]] = count

        initFreqMap.clear()

        if isMatch:

            return divisor

    return len(s)