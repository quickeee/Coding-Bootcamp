n = input("Enter the number of triangle numbers: ")
n = int(n)
for i in range(1, n + 1):
    print ((i*(i+1))//2, end = " ")
