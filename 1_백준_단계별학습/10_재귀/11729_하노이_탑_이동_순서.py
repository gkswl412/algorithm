
# 종료 조건 설정이 중요 
# 조건
# N개의 원반을 옮기기 위해서는 N-1개의 원반을 두번째 기둥으로 옮겨야 한다.
# 가장 큰 원반이 세번째 기둥 가장 밑에 에 있어야만 한다.
# 두번째 기둥에서 n-1 개의 원반을 세번째 기둥으로 옮긴다.

global count
count = 0

def move_disk(disk_num, start_peg, end_peg):
    print("%d번 원판을 %d번 기둥에서 %d번 기둥으로 이동" %(disk_num, start_peg, end_peg))
    global count 
    count += 1
    
def hanoi(num_disks, start_peg, end_peg):
    hanoi_sub(num_disks,start_peg,end_peg,2)

def hanoi_sub(N, start_peg, end_peg, other_peg):
    if N == 1:
        move_disk(1, start_peg, end_peg)
    else:
        hanoi_sub(N - 1, start_peg, other_peg, end_peg)
        move_disk(N, start_peg, end_peg)
        hanoi_sub(N - 1, other_peg, end_peg, start_peg) 

n = int(input())
hanoi(n, 1, 3)
print("%d 번 이동" %count)