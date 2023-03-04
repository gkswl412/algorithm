white_board = [[0] * 100 for _ in range(100)]
result = 0

n = int(input())

for _ in range(n):
    x, y = map(int, input().split(' '))
    for i in range(10):
        for j in range(10):
            white_board[x+i][y+j] = 1

for i in range(100):
    for j in range(100):
        if white_board[i][j] == 1:
            result +=1

print(result)