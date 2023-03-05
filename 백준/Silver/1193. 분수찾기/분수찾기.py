x = int(input())

# 분자
numerator = 1

# 분모
denominator = 1

# 시작 인덱스
start = 1

# 대각 인덱스
n = 1

while x > n*(n+1)/2 :
    n += 1

start = int(n*(n-1) / 2 + 1)

gap = x-start

# 짝수번째 열인 경우
if n%2==0:
    denominator = n - gap
    numerator = gap + 1
# 홀수번째 열인 경우
else:
    denominator = gap + 1
    numerator = n - gap

print('{0}/{1}'.format(numerator,denominator))