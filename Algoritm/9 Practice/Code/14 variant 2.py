def ok():
    n=int(input('Введите n: '))
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
    for j in range(n):
    for i in range(n):
        print(lst[j][i],end=' ')
    print()
ok()
