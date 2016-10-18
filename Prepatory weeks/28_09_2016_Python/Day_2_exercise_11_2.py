n = input("Enter limit: ")
n = int(n)
l = 0
k = 1
while k <= n:
    k = k*2
    l += 1
for a in range(1,n+1):
    b = 0
    for i in range(0,l+1):
        if a == 2**i:
            b += 1
    if b == 0:
        print (a,end=" ")
