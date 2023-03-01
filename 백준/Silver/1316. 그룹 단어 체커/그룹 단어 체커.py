data_count = int(input())
result = data_count
for i in range(data_count):
  word = input()
  for j in range(0,len(word)-1):
      if word[j] == word[j+1]:
        pass
      elif word[j] in word[j+1:]:
        result -= 1
        break

print(result)
