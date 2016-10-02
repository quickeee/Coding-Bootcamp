n = input("Enter limit: ")
n = int(n)
l = 0
k = 1
t = [0]
while k <= n:
    k = k*2
    t.append(2**l)
    l += 1
for i in range(0,n+1):
    if i not in t:
        print(i,end=" ")
