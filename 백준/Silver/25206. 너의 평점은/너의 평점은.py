sum = 0
score_sum = 0;

for i in range(20):
  subject = input()
  score_info = subject.split(' ')
  if score_info[2] == 'P':
    continue
  score_sum += float(score_info[1])
  if score_info[2] == 'A+':
    sum += 4.5 * float(score_info[1])
  elif score_info[2] == 'A0':
    sum += 4.0 * float(score_info[1])
  elif score_info[2] == 'B+':
    sum += 3.5 * float(score_info[1])
  elif score_info[2] == 'B0':
    sum += 3.0 * float(score_info[1])
  elif score_info[2] == 'C+':
    sum += 2.5 * float(score_info[1])
  elif score_info[2] == 'C0':
    sum += 2.0 * float(score_info[1])
  elif score_info[2] == 'D+':
    sum += 1.5 * float(score_info[1])
  elif score_info[2] == 'D0':
    sum += 1.0 * float(score_info[1])
  elif score_info[2] == 'F':
    sum += 0.0 * float(score_info[1])
    
print(sum/score_sum)