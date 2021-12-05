n = int(input())

for i in range(0,n):
    for j in range(0,n):
        if(i==1 and j==1):
            print(" ", end="")
        else:
            print("*", end="")
    print("")