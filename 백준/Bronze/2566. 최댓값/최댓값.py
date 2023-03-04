arr = []
for _ in range(9):
    row = list(map(int, input().split(' ')))
    arr.append(row)

n, m = 0, 0

for i in range(9):
   for j in range(9):
      if arr[n][m] <= arr[i][j]:
         n, m = i, j

print(arr[n][m])
print(n+1,m+1)