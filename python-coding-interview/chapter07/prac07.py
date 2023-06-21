from typing import List


def solution1_brute_force(nums: List[int], target: int) -> List[int]:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]


def solution2_in_statement(nums: List[int], target: int) -> List[int]:
    for i, n in enumerate(nums):
        complement = target - n

        if complement in nums[i + 1:]:
            return [nums.index(n), nums[i + 1:].index(complement) + (i + 1)]


# 첫 번째 수를 뺀 결과 키 조회
def solution3(nums: List[int], target: int) -> List[int]:
    nums_map = {}
    for i, num in enumerate(nums):
        nums_map[num] = i

    for i, num in enumerate(nums):
        if target - num in nums_map and i != nums_map[target - num]:
            return [i, nums_map[target - num]]


# 조회 구조 개선
def solution4(nums: List[int], target: int) -> List[int]:
    nums_map = {}
    for i, num in enumerate(nums):
        if target - num in nums_map:
            return [nums_map[target - num], i]
        nums_map[num] = i


# 투 포인터 사용
def solution5(nums: List[int], target: int) -> List[int]:
    nums.sort()
    left, right = 0, len(nums) - 1
    while not left == right:
        if nums[left] + nums[right] < target:
            left += 1
        elif nums[left] + nums[right] > target:
            right -= 1
        else:
            return [left, right]


if __name__ == "__main__":
    print(solution1_brute_force(nums=[2, 7, 11, 15], target=9))
    print(solution2_in_statement(nums=[2, 7, 11, 15], target=9))
    print(solution3(nums=[2, 7, 11, 15], target=9))
    print(solution4(nums=[2, 7, 11, 15], target=9))
    print(solution5(nums=[2, 7, 11, 15], target=9))
