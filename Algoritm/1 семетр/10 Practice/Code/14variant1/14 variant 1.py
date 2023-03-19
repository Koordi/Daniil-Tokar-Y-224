def ok():
    l = []
    with open('TokarDaniilY224vvod.txt', 'r') as file:
        m = file.read(1)
        m = int(m)
        l = file.readlines()
    l = [[int(n) for n in x.split()] for x in l]
    del(l[0])
    b=-99999999999
    for i in range(len(l)):
        if l[i][i]>b:
            b=l[i][i]
            ind=i
    l1=l[m-1]
    l[m-1]=l[ind]
    l[ind]=l1
    with open('TokarDaniilY224vivod.txt', 'w') as file:
        for i in range(len(l)):
            for j in range(len(l[i])):
                file.write(str(l[i][j]))
                file.write(' ')
            file.write('\n')
ok()
