import re
from typing import List
from collections import Counter


def solution(paragraph: str, banned: List[str]) -> str:
    words = [word for word in re.sub(r'[^\w]', ' ', paragraph).lower().split() if word not in banned]

    counts = Counter(words)
    return counts.most_common(1)[0][0]


if __name__ == "__main__":
    print(solution(paragraph="Bob hit a ball, the hit Ball flew far after it was hit",
                   banned=["hit"]))
