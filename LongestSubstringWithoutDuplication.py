s=input()
lastSeen={}
longest=[0,1]
start=0;
for i,char in enumerate(s):
    if char in lastSeen:
        start=max(start,lastSeen[char] +1)
    if longest[1]-longest[0]<i+1-start:
        longest=[start,i+1]
    lastSeen[char]=i
print (s[longest[0]:longest[1]])