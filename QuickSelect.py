n=int(input("ENTER THE LENGTH"))
a=[]
for i in range(0,n):
    a.append(int(input()))
k=int(input())
pos=k-1
start=0
end=len(a)-1
m=True
while m:
    if start>end:
        raise Eception("Not Here")
    pivot=start
    left=start+1
    right=end
    while left<=start:
        if a[left]>a[pivot] and a[right]<a[pivot]:
            a[left], a[right]=a[right] ,a[left]
        if a[left]<=a[pivot]:
            left+=1
        if a[right]>=a[pivot]:
            right-=1
    a[pivot] ,a[right]= a[right] ,a[pivot]
    if right==pos:
        print(a[right])
        m=False
    elif right<pos:
        start=right+1
    else:
        end=right-1