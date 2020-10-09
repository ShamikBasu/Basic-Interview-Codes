n=int(input("ENTER THE LENGTH"))
a=[]
for i in range(0,n):
    a.append(int(input()))
nums={}
t=int(input("ENTER THE Target"))
for num in a:
    if t-num in nums:
        print([t-num,num])
    else:
        nums[num]=True