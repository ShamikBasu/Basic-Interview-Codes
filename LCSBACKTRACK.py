str1= input()
str2= input()
lcs=[[[None,0,None,None] for x in range (len(str1)+1)]for y in range (len(str2)+1)]
for i in range(1,len(str2)+1):
    for j in range(1,len(str1)+1):
        if str2[i-1]==str1[j-1]:
            lcs[i][j]=[str2[i-1],lcs[i-1][j-1][1]+1,i-1,j-1]
        else:
            if lcs[i-1][j][1]>lcs[i][j-1][1]:
                lcs[i][j]=[None,lcs[i-1][j][1],i-1,j]
            else:
                lcs[i][j]=[None,lcs[i][j-1][1],i,j-1]
sequence=[]
i=len(lcs)-1
j=len(lcs[0])-1
while(i!=0 and j!=0):
    currEntry=lcs[i][j]
    if currEntry[0] is not None:
        sequence.append(currEntry[0])
    i=currEntry[2]
    j=currEntry[3]
print(list(reversed(sequence)))