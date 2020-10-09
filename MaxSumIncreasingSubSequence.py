n=int(input("ENTER THE LENGTH"))
a=[]
for i in range(0,n):
    a.append(int(input()))
sequence=[None for x in a]
sum=a[:]
maxSumIndex=0
for i in range(len(a)):
    currNum=a[i]
    for j in range(0,i):
        otherNum=a[j]
        if otherNum<currNum and sum[j]+currNum>=sum[i]:
            sum[i]=sum[j]+currNum
            sequence[i]=j
    if sum[i]>=sum[maxSumIndex]:
        maxSumIndex=i
buildSeq=[]
currIdx=maxSumIndex
print(sum[maxSumIndex])
while currIdx is not None:
    buildSeq.append(a[currIdx])
    currIdx=sequence[currIdx]
print(list(reversed(buildSeq)))