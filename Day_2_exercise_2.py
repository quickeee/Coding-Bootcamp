bitnumber = input('Please enter the 8-bit binary number for check: ')
if len(bitnumber) == 8:
    sum = 0
    for i in range(0,8):
        sum += int(bitnumber[i])
    if sum%2 == 0:
        print('Parity check ok!')
    else:
        print('Parity check not ok')
else:
    print('The number you entered in not a valid 8-bit number!')
