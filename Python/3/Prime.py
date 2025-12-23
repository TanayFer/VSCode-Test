A = int(input('Enter A Number: '))
cnt = 0
for i in range(1, A + 1):
    if A % i == 0:
        cnt = cnt + 1;

if cnt == 2:
    print("Is Prime");
else:
    print("Not Prime");