def checkArm(n):
    k= len(str(n))
    temp= n
    sum= 0
    while n!=0:
        r= n%10
        sum+= pow(r, k)
        n= n//10
    
    return sum==temp

i= 0
c= 0
while(c<=30):
    if(checkArm(i)):
        c+=1
        print(i)
    i+=1