import math
a = input("What's the first side of the triangle? ")
a = int(a)
b = input("What's the second side of the triangle? ")
b=int(b)
c = input("What's the third side of the triangle? ")
c=int(c)
d = (a+b+c)*(b+c-a)*(a-b+c)*(a+b-c)
area = (math.sqrt(d))/4
print ("The area of the given triangle equals to", area)
