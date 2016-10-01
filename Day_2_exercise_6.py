one = ""
two = ""
three = ""
for i in range(0,9):
    digit = input("Enter the numbers and clikc enter after each number: ")
    if len(digit) == 1:
        one += "   " + digit + "|"
    elif len(digit) == 2:
        two += "  " + digit + "|"
    else:
        three += " " + digit + "|"
print (one[:-1])
print (two[:-1])
print (three[:-1])
