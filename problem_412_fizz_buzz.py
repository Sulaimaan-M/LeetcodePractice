def fizzBuzz(self, n: int) -> list[str]:

    res = []
    for x in range(1, n+1):

        string = ""
        if x%3 is 0 or x%5 is 0:

            if x%3 is 0:
                string+= "Fizz"

            if x%5 is 0:
                string+= "Buzz"
        else:

            string += str(x)

        res.append(string)

    return res
