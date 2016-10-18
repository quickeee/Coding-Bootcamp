import string
shift = input("Enter shift: ")
phrase = input("Enter the encrypted phrase: ")
shift = int(shift)
a = []
for char in phrase:
    a.append(ord(char))
b = []
for i in range(0,len(a)):
    b.append(a[i]-shift)
declist = [] #In this case this list is the decrypted list...
for k in range(0,len(a)):
    if b[k] < 65:
        declist.append(90 - (64 - b[k])%26)
    else:
        declist.append(b[k])
for j in range(0,len(a)):
    print (chr(declist[j]),end="")
