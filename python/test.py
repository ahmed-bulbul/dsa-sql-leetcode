# s= input()
# st = ""
# for i in range((len(s)-1),-1,-1):
#     # print(s[i],end="")
#     st += s[i]
# if s==st:
#     print("Palindrom")
# else:
#     print("Not Palindrom")        
# print("\n")

s=input()
l = len(s)
# bool = False
cnt=0
for i in range(0, l-1):
    # indx = abs(i-(l-1))
    if s[i]==(s[(l-1)-i]):
        cnt=cnt+1
        print("Inside:", cnt)
    else:
        cnt=0

print(cnt)        
if(cnt>0):
    print("Yes")
else:
    print("NO")    

