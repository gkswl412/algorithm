def arrayMax(list, n):
    for i in range(1,n+1):
        list.append(i)
    currentMax = 0
    cnt = 1
    for j in list:
        if currentMax < j:
            cnt +=1
            currentMax = j
            cnt +=1
    return currentMax,cnt

print(arrayMax([],100))

