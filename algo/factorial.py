
def factorial(N):
    while(True):
        if(N>1):
            return N*factorial(N-1);
        else:
            return 1;

print(factorial(int(input())))