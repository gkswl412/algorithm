# queue.py 의 Queue import
from queue import Queue
# 입력 갯수 n, termNumber k 를 파라메터로 하는 josephus라는 함수 구현
def josephus(n,k):
    queue = Queue()
    # queue에 0부터 n까지의 숫자를 enqueue
    for i in range(1,n+1):
        queue.enqueue(i)
    print(queue.item)
    # queue에 하나의 숫자만 남을때 까지 반복
    while(queue.frontIndex != (len(queue.item)-1)):
        for i in range(0,k):
            if i == k-1:
                queue.dequeue()
            else:
                queue.enqueue(queue.dequeue())
            print(queue.item)
    return queue.item[queue.frontIndex]


print(josephus(9,3))