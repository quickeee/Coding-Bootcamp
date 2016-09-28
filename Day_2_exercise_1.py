TIN = input('Please enter the TIN code you would like to check: ')
if len(TIN) == 9: #There is no reason for the computer to work if user inputs a number that is not exactly 9 digits...
    sum = 0
    for i in range(8,0,-1):
        sum += (int(TIN[i-1]))*2**(9-i)
    modulo = sum%11
    modulo2 = modulo%10
    if modulo == modulo2 == int(TIN[8]):
        print('Congratulations, Tax Identification number valid!')
    else:
        print('The Tax identification number you have entered in not a valid one! Try again with another!')
else:
    print('The Tax identification number you have entered in not a valid one! Try again with another!')
