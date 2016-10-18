sequence = input("Enter binary sequence: ")
max0 = 0
max1 = 0
counter0 = 0
counter1 = 0
for x in sequence:
    if x == "1":
        counter1 += 1
        if counter1 > max1:
            max1 = counter1
        counter0 = 0
    else:
        counter0 += 1
        if counter0 > max0:
            max0 = counter0
        counter1 = 0
if max0 > max1:
    print ("Longest run was zeros with length:",max0)
elif max1 > max0:
    print ("Longest run was ones with length:",max1)
else:
    print ("Equal longest run of ones and zeros with length:",max0)
