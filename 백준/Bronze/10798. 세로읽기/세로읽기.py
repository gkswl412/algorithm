arr = []

for _ in range(5):
    row = input()
    if len(row) < 15:
        row += '*' * (15-len(row))
    arr.append(row)

result = ''
for column in range(15):
  for row in range(5):
      if arr[row][column] == '*':
          continue
      result += arr[row][column]

print(result)