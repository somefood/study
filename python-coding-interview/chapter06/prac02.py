from typing import List


def solution(li: List[str]) -> None:
    # print(li[::-1]) # 공간 복잡도 O(1)로 제한하면 틀릴 수 있음
    li.reverse()
    print(li)


if __name__ == "__main__":
    solution(["h", "e", "l", "l", "o"])
    solution(["H", "a", "n", "n", "a", "h"])
