from typing import List
from collections import defaultdict

def solution(words: List[str]) -> List[List[str]]:
    anagram_dict = defaultdict(list)
    for word in words:
        key = ''.join(sorted(list(word)))
        anagram_dict[key].append(word)

    answer = []
    for value in anagram_dict.values():
        answer.append(value)
    return answer


if __name__ == "__main__":
    print(solution(["eat", "tea", "tan", "ate", "nat", "bat"]))