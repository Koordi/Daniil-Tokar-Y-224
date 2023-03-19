def ok():
    l = []
    with open('TokarDaniilY224vvod.txt', 'r') as file:
        n = file.readline()
        n = int(n)
    k=0
    j=0
    p=0
    lst = [0] * n
    for i in range(n):
        lst[i] = [0] * n
    while k!=n*n: 
        for i in range(p,n):       
            if lst[j][i]==0:
                k+=1
                lst[j][i]=k
            else:
                i-=1
                break
        p=j+1
        for j in range(p,n):
            if lst[j][i]==0:
                k+=1
                lst[j][i]=k
            else:
                j-=1
                break
        p=i-1
        for i in range(p,-1,-1):       
            if lst[j][i]==0:
                k+=1
                lst[j][i]=k
            else:
                i+=1
                break
        p=j-1
        for j in range(p,-1,-1):
            if lst[j][i]==0:
                k+=1
                lst[j][i]=k
            else:
                j+=1
                break
        p=i+1
    with open('TokarDaniilY224vivod.txt', 'w') as file:
        for i in range(len(lst)):
            for j in range(len(lst[i])):
                file.write(str(lst[i][j]))
                file.write(' ')
            file.write('\n')
ok()

