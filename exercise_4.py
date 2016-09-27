import math
a = input("Enter the a value ")
a=int(a)
b = input("Enter the b value ")
b=int(b)
c = input("Enter the c value ")
c=int(c)
if (b**2-(4*a*c)) < 0:
    print ("Dear user unfortunately there are no real-valued solutions that exist for this equation")
else:
    d = b**2-4*a*c
    x1 = ((((-1)*b)+math.sqrt(d)))/(2*a)
    x2 = ((((-1)*b)-math.sqrt(d)))/(2*a)
    print ("The first solution is:", x1)
    print ("The second solution is:", x2)
