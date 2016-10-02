sequence = input("Enter number sequence: ")
a = []
for b in sequence:
    a.append(b)
s = 0
for i in range(0,len(a)):
    if i%2 == 0:
        s += int(a[i])*int(a[i+1])
print (s)
