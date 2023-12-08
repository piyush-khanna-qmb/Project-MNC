def findEffi(nums):
    nums.sort()

    n = len(nums)

    maxi = 0

    for i in range(n):
        effi = 0
        for j in range(i, n): 
            effi += nums[j] * (j - i + 1)
        maxi = max(maxi, effi)

    return maxi

nums = list(map(int, input().split()))
res = findEffi(nums)

print(res if res >= 0 else 0, end= "")
