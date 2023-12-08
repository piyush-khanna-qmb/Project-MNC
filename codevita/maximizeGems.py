n = int(input())
arr = [list(map(int, i.split(':'))) for i in input().split()]

dpa = [[None for j in range(n)] for i in range(n)]


def solveFirst(i, mini):
    if i == n:
        return -float('inf') if mini != n else 0
    if arr[i][0] < arr[mini][0]:
        mini = i
    if dpa[i][mini] is not None:
        return dpa[i][mini]
    res = solveFirst(i + 1, mini)
    res = max(res, arr[mini][1] + solveFirst(i + 1, i + 1))
    dpa[i][mini] = res
    return res

dpb = [[None for j in range(n)] for i in range(n)]


def solveSec(i, maxi):
    if i == n:
        return -float('inf') if maxi != n else 0
    if arr[i][0] > arr[maxi][0]:
        maxi = i
    if dpb[i][maxi] is not None:
        return dpb[i][maxi]
    res = solveSec(i + 1, maxi)
    res = max(res, arr[maxi][1] + solveSec(i + 1, i + 1))
    dpb[i][maxi] = res
    return res

print(max(solveFirst(0, 0), solveSec(0, 0)), end= "")
