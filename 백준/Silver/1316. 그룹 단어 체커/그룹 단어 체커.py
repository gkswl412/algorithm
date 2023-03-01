box = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

def group_word_checker(word):
  for alphabet in box:
    start = 0
    end = 0
    if alphabet in word:
      start = word.index(alphabet) + 1
    
    for i in range(start,len(word)):
      if word[i] != alphabet:
        for j in range(i+1,len(word)):
          if word[j] == alphabet:
            return False
            
  return True

data_count = int(input())
group_word_count = 0

for i in range(0,data_count):
  data = input()
  if group_word_checker(data):
    group_word_count += 1

print(group_word_count)