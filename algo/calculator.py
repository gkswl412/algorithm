# 만들어 놓은 stack.py import
import stack

# 문자열 str을 입력 받으면, 입력받은 str을 계산하여 출력
def calculator(str):

    # 연산자를 담을 stack 선언
    opStack = stack.Stack()

    # 피연산자를 담을 stack 선언
    oprandStack = stack.Stack()

    # postFix 형태의 수식을 담을 list
    postFix = []

    # 문자열 str의 숫자파편을 모아서 number로 만든다. ex) '1'+'9'+'1' = 191 
    number = ''

    for i in range(0, len(str)):
        
        # i가 ( 인 경우 -> opStack에 i push
        if str[i]=='(':
            opStack.push(str[i])

        # i가 ) 인 경우 -> 
        # opStack에서 ( 까지 pop 후 '(',')'를 제외한 연산자 postFix에 append
        elif str[i]==')':
            # 완성된 number를 postFix에 append
            postFix.append(number)
            # number 변수 초기화 -> 초기화하지 않으면, 계속해서 숫자가 붙어서 엄청 값이 커진다. 따라서 초기화 필수 
            number = ''
            while(opStack.topValueOfStack()!='('):
                postFix.append(opStack.pop())
            opStack.pop()

        # i가 +,- 인 경우 -> opStack의 top이 *,/ 인 경우 
        # top이 +,-,( , null 가 될때 까지 pop후 postFix에 append, 그 후
        # opStack에 i push
        # top이 *,/ 가 아닌 경우 opStack에 바로 i push
        elif str[i] in ['+','-']:
            if str[i-1] != ')':
                postFix.append(number)
                number = ''
            if opStack.topValueOfStack() in ['*','/']:
                while(opStack.topValueOfStack() in ['*','/']):
                    postFix.append(opStack.pop())
                opStack.push(str[i])
            else:
                opStack.push(str[i])

        # i가 *,/ 인 경우 -> opStack에 i push
        elif str[i] in ['*','/']:
            if str[i-1] != ')':
                postFix.append(number)
                number = ''
            opStack.push(str[i])

        # i가 숫자인 경우 -> i가 연산자가 될때 까지 number += i 
        # i가 마지막 인덱스인 경우 postFix에 append
        else:
            number += str[i]
            try:
                max = str[i+1]
            except IndexError:
                postFix.append(number)

    # 다 끝난 후 len(opStack) !=0 인 경우 모두 pop후 , postFix에 append
    if len(opStack) != 0:
        while(len(opStack) != 0):
            postFix.append(opStack.pop())
    
    # postFix 수식 계산후 결과값 return
    for i in range(0, len(postFix)):
        if postFix[i] == '+':
            b = oprandStack.pop()
            a = oprandStack.pop()
            result = int(a) + int(b)
            oprandStack.push(result)
        elif postFix[i] == '-':
            b = oprandStack.pop()
            a = oprandStack.pop()
            result = int(a) - int(b)
            oprandStack.push(result)
        elif postFix[i] == '*':
            b = oprandStack.pop()
            a = oprandStack.pop()
            result = int(a) * int(b)
            oprandStack.push(result)
        elif postFix[i] == '/':
            b = oprandStack.pop()
            a = oprandStack.pop()
            result = int(a) / int(b)
            oprandStack.push(result)
        else:
            oprandStack.push(postFix[i])
    
    return oprandStack.topValueOfStack()
        

print(calculator(input('입력>')))
