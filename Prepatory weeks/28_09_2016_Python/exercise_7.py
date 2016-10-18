import math
def days(dayone,monthone,yearone,daytwo,monthtwo,yeartwo):
    """returns the days elapsed between 2 dates AD:"""
    import math
    result = 0
    c1 = 365*yearone + yearone//4 - yearone//100 + yearone//400 + (306*monthone + 5)//10 + dayone - 1
    c2 = 365*yeartwo + yeartwo//4 - yeartwo//100 + yeartwo//400 + (306*monthtwo + 5)//10 + daytwo - 1
    result = abs(c2 - c1)
    return result
dates = input('Enter dates: ').split(" ")

date_1 = dates[0].split("/")
date_2 = dates[1].split("/")

for i in range(3):
    date_1[i] = int(date_1[i])
    date_2[i] = int(date_2[i])

dayone = date_1[0]
monthone = date_1[1]
yearone = date_1[2]
daytwo = date_2[0]
monthtwo = date_2[1]
yeartwo = date_2[2]
#In the following statements the think behind this algorithm is:
#We take the distance from the negative year till the 1/1 of the next negative year and we tranfer that distance to the positive years.
#Let's say 5/10/-3. The distance form 5/10/-3 till 1/1/-2 is exactly the same as 5/10/3 till 1/1/4. All the leap years included correctly!
#To find the whole distance from 5/10/-3 till 1/1/1 we just have to add the distance 1/1/-2 till 1/1/1 and this is the same from 1/1/3 till 1/1/1.
#To do all the above thinking we assume that there is no year 0. So the day after 31/12/-1 is 1/1/1.
if yearone >= 0:
    if yeartwo >= 0:
        print (days(dayone,monthone,yearone,daytwo,monthtwo,yeartwo))
    else:
        tempdays = days(daytwo,monthtwo,abs(yeartwo),1,1,(abs(yeartwo)+1)) + days(1,1,(abs(yeartwo)),1,1,1)
        print (days(dayone,monthone,yearone,1,1,1)+tempdays)
else:
    if yeartwo >= 0:
        tempdays = days(dayone,monthone,abs(yearone),1,1,(abs(yearone)+1)) + days(1,1,(abs(yearone)),1,1,1)
        print (days(daytwo,monthtwo,yeartwo,1,1,1)+tempdays)
    else:
        tempdays = days(daytwo,monthtwo,abs(yeartwo),1,1,(abs(yeartwo)+1)) + days(1,1,(abs(yeartwo)),1,1,1)
        tempdays1 = days(dayone,monthone,abs(yearone),1,1,(abs(yearone)+1)) + days(1,1,(abs(yearone)),1,1,1)
        print (abs(tempdays - tempdays1))
