class Stack:
    def __init__(self):
        self.myStack = []
    
    def push(self, value):
        self.myStack.append(value)
    
    def pop(self):
        try:
            return self.myStack.pop()
        except IndexError:
            print("Stack is empty")
            return False
    
    def top(self):
        try:
            return self.myStack[-1]
        except IndexError:
            print("Stack is empty")
            return False
    
    def __len__(self):
        return len(self.myStack)


def parentheses(str):
    s = Stack()
    for i in str:
        if i=="(":
            s.push(i)
        else:
            if s.pop()==False:
                return False
    if len(s) > 0:
        return False
    return True

print(parentheses(input("입력>")))

