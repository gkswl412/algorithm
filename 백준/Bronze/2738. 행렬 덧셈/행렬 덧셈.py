a, b = [], []

n, m = map(int, input().split())

for row in range(n):
    row = list(map(int, input().split()))
    a.append(row)

for row in range(n):
    row = list(map(int, input().split()))
    b.append(row)


for row in range(n):
    for column in range(m):
        print(a[row][column] + b[row][column],end=' ')
    print()