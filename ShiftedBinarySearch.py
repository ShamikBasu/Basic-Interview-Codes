n=int(input("ENTER THE LENGTH"))
a=[]
for i in range(0,n):
    a.append(int(input()))
left=0
right=len(a)-1
t =int(input())
while left<=right:
    mid=(left+right)//2
    potMatch=a[mid]
    rightNum=a[right]
    leftNum=a[left]
    if t==potMatch:
        print(potMatch)
        break
    elif leftNum<=potMatch:
        if t<potMatch and t>=leftNum:
            right=mid-1
        else:
            left=mid + 1
    else:
        if t>potMatch and t<=rightNum:
            left=mid + 1
        else:
            right=mid-1