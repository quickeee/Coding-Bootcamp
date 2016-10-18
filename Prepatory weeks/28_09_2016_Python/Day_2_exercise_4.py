numbers = input('Enter the 9-digit number ')
if len(numbers) == 9:
    line1 = ' '
    line2 = '  '
    line3 = '   '
    for k in range(0,9,3):
        line1 += '  ' + numbers[k]
    for j in range(1,9,3):
        line2 += '  ' + numbers[j]
    for i in range(2,9,3):
        line3 += '  ' + numbers[i]
    print(line1)
    print(line2)
    print(line3)
else:
    print("Dear user, you haven't entered a 9-digit number!!")
