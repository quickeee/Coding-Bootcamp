numbers = input('Enter the 10-digit number: ')
evenpos = ''
oddpos = ' '
if len(numbers) == 10:
    for x in range(10):
        if x%2 == 0:
            evenpos += " " + numbers[x]
        else:
            oddpos += ' ' + numbers[x]
    print(evenpos)
    print(oddpos)
else:
    print ("This is not a valid 10-digit number!")
