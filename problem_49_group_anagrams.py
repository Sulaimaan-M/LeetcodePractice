from collections import defaultdict

def groupAnagrams(strs: list[str]) -> list[list[str]]:

    resultMap: dict = defaultdict(list)

    for string in strs:

        sorted_string = "".join(sorted(string))

        resultMap[sorted_string].append(string)

    return list(resultMap.values())

print(groupAnagrams(["x"]))