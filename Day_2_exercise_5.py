year = input('Dear user please enter the current year: ')
yearint = int(year)
a = yearint%4
b = yearint%7
c = yearint%19
d = (19*c+15)%30
e = (2*a+4*b-d+34)%7
month = (((d+e+114)//31)//1)
day = ((d+e+114)%31)+1
day = day + 13
#We only have to check if the month is march, april or may because Easter Sunday has to be in one of thease months...
if month == 3 or month == 5:
    if day > 31:
        day -= 31
        month += 1
elif month == 4:
    if day > 30:
        day -= 30
        month += 1
print ("Day: ",day,"Month: ",month)
