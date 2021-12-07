class Stack:

    # Stack class를 선언할때 item이라는 list를 생성하는 생성자 함수
    def __init__(self):
        self.item = []
    
    # Stack class의 기능 : push() 구현
    def push(self,value):
        self.item.append(value)
    
    # Stack class의 기능 : pop() 구현
    def pop(self):
        try:
            return self.item.pop()
        # Stack.item 리스트가 비어있는 경우
        except IndexError:
            print("Stack이 비어 있습니다.")
            return -1
    
    # Stack class의 기능 : top() 구현
    def topValueOfStack(self):
        try:
            return self.item[-1]
        except IndexError:
            print("Stack이 비어 있습니다.")
            return -1

    # Stack class의 기능 : len() 구현
    def __len__(self):
        return len(self.item)