array = [87, 20, 46, 11, 37, 45, 3, 1, 0]

def choice_sort(array):
    for i in range(len(array)):
        min_index = i
        for j in range(i, len(array)):
            if array[min_index] > array[j]:
                min_index = j
        array[i], array[min_index] = array[min_index], array[i]

choice_sort(array)
print(array)