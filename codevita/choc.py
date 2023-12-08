def maxi(chocs,init):
  chocs=sorted(chocs)
  pnts=1
  l=[1]
  i=0
  while i < len(chocs):
    if chocs[i]<=init:
      init=init-chocs[i]
      pnts+=1
      i+=1
    else:
      pnts-=1
      init+=chocs[-1]
      chocs.pop()
    l.append(pnts)
  return max(l)
# Example usage:
chocoList = list(map(int, input().split()))  # Input list of chocs
init_chocs = int(input())  # init chocs Bittu has
res = maxi(chocoList, init_chocs)
print(res,end="")