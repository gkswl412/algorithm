result = 0

inputStr = input()
arr = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in arr:
    splitArr = inputStr.split(i)
    result += len(splitArr) - 1
    inputStr = ' '.join(splitArr)

result += len(''.join(inputStr.split(' ')))

print(result)