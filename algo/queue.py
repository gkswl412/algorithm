# queue 클래스 
class Queue:
    # 생성자 함수 : queue 객체 생성시 item이라는 리스트 생성 / queue의 front를 가리키는 frontIndex 변수 선언
    def __init__(self):
        self.frontIndex = 0
        self.item = []
    # enqueue 구현
    def enqueue(self, val):
        self.item.append(val)
    # dequeue 구현
    def dequeue(self):
        if(self.frontIndex == len(self.item)):
            print("Queue is empty")
            return None
        else:
            frontValueOfQueue = self.item[self.frontIndex]
            self.frontIndex += 1
            return frontValueOfQueue
    

    
    