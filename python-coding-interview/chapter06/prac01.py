def solution(s: str) -> str:
    list_with_alpha_num: list = [i.lower() for i in s if i.isalnum()]
    alpha_num: str = "".join(list_with_alpha_num)
    half = len(alpha_num) // 2

    half_one: str = alpha_num[:half]
    half_two: str = alpha_num[-1:-(half + 1):-1]

    return "true" if half_one == half_two else "false"


if __name__ == "__main__":
    print(solution("A man, a plan, a canal: panama"))
    print(solution("race a car"))
