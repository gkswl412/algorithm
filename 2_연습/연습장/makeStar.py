
def star(n: int, x: list)-> list:
    out = [] #한번 처리한 값
    if n == 3:
        return x
    else:
        for i in x: # 상단 3개의 구역
            out.append(i*3)
        for i in x: # 중단 3개의 구역
            out.append(i+' '*len(x)+i)
        for i in x: # 하단 3개의 구역
            out.append(i*3)
        return star(n//3, out)

if __name__== "__main__":
    n = int(input())
    first = ['***', '* *', '***']
    final = star(n, first)
    print(final)
    for i in final:
        print(i)