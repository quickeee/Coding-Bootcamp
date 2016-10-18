import string
shift = input("Enter shift: ")
phrase = input("Enter phrase: ")
shift = int(shift)
a = []
for char in phrase:
    a.append(ord(char))
b = []
for i in range(0,len(a)):
    b.append(a[i]+shift)
enclist = [] #This is the encrypted phrase in which the numbers belong to the ascii code uppercase sequence order...
for k in range(0,len(a)):
    if b[k] > 90:
        enclist.append((b[k] - 64)%26 + 64)
    else:
        enclist.append(b[k])
for j in range(0,len(a)):
    print (chr(enclist[j]),end="")
