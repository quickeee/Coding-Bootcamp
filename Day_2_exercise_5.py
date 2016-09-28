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
if yearint%4 == 0:
    if month == 2:
        if day > 29:
            day -= 29
            month += 1
    elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:
        if day > 31:
            day -= 31
            month += 1
    else:
        if day > 30:
            day -= 30
            month += 1
else:
    if month == 2:
        if day > 28:
            day -= 29
            month += 1
    elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:
        if day > 31:
            day -= 31
            month += 1
    else:
        if day > 30:
            day -= 30
            month += 1
print("Day: ",day,' ', "Month: ",month)
